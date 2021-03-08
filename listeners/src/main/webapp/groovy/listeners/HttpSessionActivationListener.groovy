package listeners

import org.gservlet.annotation.SessionActivationListener

@SessionActivationListener
class HttpSessionActivationListener {

	void sessionDidActivate() {
		logger.info("session activated")
	}

	void sessionWillPassivate() {
		logger.info("session passivated")
	}

}