package com.xworkz.dammy.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;


@Configuration
@ComponentScan(basePackages = "com.xworkz.dammy")
public class ConfigureDoc {

	@Bean
	public PropertySourcesPlaceholderConfigurer createBean() {
	System.out.println("Invoked CreateBean Method");
	PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
	ClassPathResource resource = new ClassPathResource("property.properties");
	configurer.setLocation(resource);
	return configurer;
		
	}
}

