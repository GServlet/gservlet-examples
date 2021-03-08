package listeners

import org.gservlet.annotation.SessionListener

@SessionListener
class HttpSessionListener {

	void sessionCreated() {
	   logger.info("session created")
	}

	void sessionDestroyed() {
	   logger.info("session destroyed")
	}

}