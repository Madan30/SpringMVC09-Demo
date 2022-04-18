package com.NepalCode.JavaBasedConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JavaAppInitilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(JavaConfigFile.class);
		
		// creating dispatcher servelt object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// register the dispatcher servlet and mapped the url
		ServletRegistration.Dynamic registration = servletContext.addServlet("myServelt",dispatcherServlet);
		registration.addMapping("/");
		registration.setLoadOnStartup(1);
		
		

	}

}
