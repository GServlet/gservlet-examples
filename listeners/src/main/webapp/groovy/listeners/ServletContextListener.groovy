package listeners

import org.gservlet.annotation.ContextListener

@ContextListener
class ServletContextListener {

	void contextInitialized() {
	   logger.info("context started")
	}

	void contextDestroyed() {
	   logger.info("context destroyed")
	}

}
