package com.xworkz.applicationData.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	public FrontControllerConfiguration() {
		
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses Method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses Method");
		return new Class[] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings Method");
		return new String[] {"*.do"};
	}

}
