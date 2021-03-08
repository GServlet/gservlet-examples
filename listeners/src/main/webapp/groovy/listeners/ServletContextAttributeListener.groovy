package listeners

import org.gservlet.annotation.ContextAttributeListener

@ContextAttributeListener
class ServletContextAttributeListener {

	void attributeAdded() {
		logger.info("context attr $name added with value $value")
	}

	void attributeRemoved() {
		logger.info("context attr $name removed with value $value")
	}

	void attributeReplaced() {
		logger.info("context attr $name replaced with value $value")
	}

}
