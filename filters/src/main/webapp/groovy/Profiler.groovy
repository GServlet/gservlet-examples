import org.gservlet.annotation.Filter
import org.gservlet.annotation.InitParam

@Filter(urlPatterns = ["/*"],
        initParams = @InitParam(name = "env", value = "dev"))
public class Profiler {

    void filter() {
        if ("dev" == config.env) {
            long time = System.currentTimeMillis()
            next()
            time = System.currentTimeMillis() - time
            println("Time taken for request to complete:  ${time}ms")
            println("Request url : $request.requestURL")
        } else {
            next()
        }
    }

}