package listeners

import org.gservlet.annotation.RequestAttributeListener

@RequestAttributeListener
class ServletRequestAttributeListener {

	void attributeAdded() {
		logger.info("request attr $name added with value $value")
	}

	void attributeRemoved() {
		logger.info("request attr $name removed with value $value")
	}

	void attributeReplaced() {
		logger.info("request attr $name replaced with value $value")
	}

}