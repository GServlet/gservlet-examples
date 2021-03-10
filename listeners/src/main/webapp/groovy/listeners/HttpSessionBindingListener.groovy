package listeners

import org.gservlet.annotation.SessionBindingListener

@SessionBindingListener
class HttpSessionBindingListener {

	void valueBound() {
		logger.info("session attr $name bounded with $value")
	}

	void valueUnbound() {
		logger.info("session $name unbounded with $value")
	}

}
