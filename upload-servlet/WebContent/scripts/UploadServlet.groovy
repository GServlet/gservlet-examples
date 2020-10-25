import org.gservlet.annotation.InitParam
import org.gservlet.annotation.Servlet
import javax.servlet.annotation.MultipartConfig

@Servlet( urlPatterns = "/upload",
initParams = [
	@InitParam(name = "uploadDirectory", value = "/images")
] )
@MultipartConfig( fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 25 )
class UploadServlet {

	String uploadPath

	void init() {
		uploadPath = context.getRealPath(config.uploadDirectory)
		File uploadDir = new File(uploadPath)
		if (!uploadDir.exists()) {
			uploadDir.mkdir()
		}
	}
	
	void get() {
		File uploadDir = new File(uploadPath)
		def files = []
		uploadDir.listFiles()?.each { file -> 
			files << [name : file.name, length : file.length(), lastModified : file.lastModified()]
		}
		json(files);
	}

	void post() {
		request.getParts().each { part ->
			String file = uploadPath + File.separator + request.getFileName(part)
			part.write(file)
		}
		redirect(context.contextPath + "/upload");
	}

}