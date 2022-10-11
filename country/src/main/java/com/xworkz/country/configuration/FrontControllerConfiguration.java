package com.xworkz.country.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	public FrontControllerConfiguration() {
		System.out.println("Calling default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling getRootConfigClasses Method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getServletConfigClasses Method");
		return new Class[] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling getServletMappings Method");
		return new String[] {"*.do"};
	}

}
