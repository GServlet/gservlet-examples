package listeners

import org.gservlet.annotation.SessionIdListener

@SessionIdListener
class HttpSessionIdListener {

	void sessionIdChanged() {
		logger.info("the session id was $oldSessionId")
	}
	
}
