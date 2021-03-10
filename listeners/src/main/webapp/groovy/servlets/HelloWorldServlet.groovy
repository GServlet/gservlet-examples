package servlets

import listeners.HttpSessionBindingListener
import org.gservlet.annotation.Servlet

@Servlet(value="/index.html")
class HelloWordServlet {

	void get() {
		context.attr = "my attribute"
		context.attr = "test"
		context.removeAttribute("attr")
		request.attr = "my attribute"
		request.attr = "test"
		request.removeAttribute("attr")
		session.attr = "my attribute"
		session.attr = "test"
		session.removeAttribute("attr")
		session.test = "test"
		logger.info("session id $session.id")
		HttpSessionBindingListener data = new HttpSessionBindingListener()
		session.data = data;
		session.removeAttribute("data")
		request.changeSessionId()
		logger.info("session id $session.id")
		session.invalidate()
		html.html {
			body {
				p("Handling Events With GServlets!")
			}
		}
	}
}