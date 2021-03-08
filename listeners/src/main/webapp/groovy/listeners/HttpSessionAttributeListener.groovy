package listeners

import org.gservlet.annotation.SessionAttributeListener

@SessionAttributeListener
class HttpSessionAttributeListener {

	void attributeAdded() {
		logger.info("session attr $name added with value $value")
	}

	void attributeRemoved() {
		logger.info("session attr $name removed with value $value")
	}

	void attributeReplaced() {
		logger.info("session attr $name replaced with value $value")
	}

}