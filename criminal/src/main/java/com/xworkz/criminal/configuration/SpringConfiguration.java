package com.xworkz.criminal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.multipart.MultipartResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.criminal")
public class SpringConfiguration {

	public SpringConfiguration() {
		
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Calling ViewResolver Method" );
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
    public MultipartResolver multipartResolver() {
		System.out.println("Created view resolver");
        return new StandardServletMultipartResolver();
    }
}
