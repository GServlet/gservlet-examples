package com.example.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.sql.DataSource;
import org.gservlet.GServletApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DemoConfiguration implements ServletContextInitializer, WebMvcConfigurer {

	private GServletApplication application;
	
	@Override
	public void onStartup(ServletContext context) throws ServletException {
		application = new GServletApplication(context);
		application.addScriptListener(bean -> {
			SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(bean, context);
		});
		application.startOnSpringBoot();	
	}
	
	@Bean(destroyMethod = "stop")
	public GServletApplication servletApplication(DataSource dataSource) {
		application.setDataSource(dataSource);
		return application;
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index.html");
	}

	
}