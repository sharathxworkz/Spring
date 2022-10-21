package com.xworkz.criminal.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SpringMvcInitializer() {
		System.out.println("Callling Default Constructor of:" + this.getClass().getSimpleName());
	}
	
	private Class[] getServletConfigClasses = {SpringConfiguration.class,DBConfiguration.class};
	private String[] getServletMappings = {"/"};
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling getRootConfigClasses Method");
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
				100000, 100000 * 2, 100000/ 2);

		registration.setMultipartConfig(multipartConfigElement);

	}
}
