import org.gservlet.annotation.Servlet

@Servlet("/users/login")
class LoginServlet {

	void post() {
		def user = authenticate(request)
		if(user) {
			session.user = [firstName : user.first_name, lastName : user.last_name]
			redirect(request.contextPath + "/home.jsp")
		} else {
			request.auth_failure = true
			request.auth_user = request.username
			forward("/index.jsp")
		}	
	}
	
	def authenticate(request) {
		return sql.firstRow('select * from users where user_name=:username and password=:password', 
			[username:request.username, password:request.password])
	}
	
}
