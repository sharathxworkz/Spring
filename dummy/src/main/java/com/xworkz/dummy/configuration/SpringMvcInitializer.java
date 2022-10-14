package com.xworkz.dummy.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	private Class[] getServletConfigClasses= {SpringConfiguration.class,DBConfiguration.class};
	private String[] getServletMappings = {"/"};
	
	public SpringMvcInitializer() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getServletConfigClasses");
		return getServletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling getServletMappings");
		return getServletMappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("Calling configureDefaultServletHandling Method");	
	configurer.enable();
	}
}
