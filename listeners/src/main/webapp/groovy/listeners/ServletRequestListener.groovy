package listeners

import org.gservlet.annotation.RequestListener

@RequestListener
class ServletRequestListener {

	void requestInitialized() {
		logger.info("request initialized on $request.contextPath")
	}

	void requestDestroyed() {
		logger.info("request destroyed")
	}

}
