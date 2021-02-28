import org.gservlet.annotation.Filter

@Filter("/*")
class LoggingFilter {
	
    void init() {
		logger.info("loggingFilter initialized")
	}

	void filter() {
		request.parameterNames.each { name ->
			logger.info("$request.remoteAddr : Request Param : {$name=$request[name]}")
		}
		request.cookies.each { cookie ->
			logger.info("$request.remoteAddr : Cookie : {$cookie.name=$cookie.value}")
		}
		next()
	}

	void destroy() {
		
	}

}