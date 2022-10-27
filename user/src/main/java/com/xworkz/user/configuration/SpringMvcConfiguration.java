package com.xworkz.user.configuration;


import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	
	Class[] getServletConfigClasses = {SpringConfiguration.class,DBConfiguration.class};
	String[] getServletMappings = {"/"};
	
	public SpringMvcConfiguration() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" Calling getRootConfigClasses Method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getServletConfigClasses Method");
		return getServletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling getServletMappings Method");
		return getServletMappings;
	}

	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Calling configureDefaultServletHandling Method");
		configurer.enable();
	}
	
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("Creatig file upload customizer");
		// upload temp file will put here
		File uploadDirectory = new File("D:/temp-files");

		// register a MultipartConfigElement
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				10000000, 10000000 * 2, 10000000/ 2);

		registration.setMultipartConfig(multipartConfigElement);

	}
}
