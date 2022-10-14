package com.xworkz.dummy.configuration;

import java.util.HashMap;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {
		System.out.println("Calling Default Constructor of:" + this.getClass().getSimpleName());
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManager(DataSource dataSource) {
	
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setPackagesToScan("com.xworkz");
		factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("Getting Data From Browser");
		factory.setDataSource(dataSource);
		
		HashMap<String,Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("Hibernate.show_sql", true);
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		
		factory.setJpaPropertyMap(jpaProperties);
		return factory;
		
	}
	
	@Bean
	public DataSource dataSource() {
	
		System.out.println("Calling DataSource Method");
		DriverManagerDataSource dataSourse = new DriverManagerDataSource();
		dataSourse.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSourse.setUrl("jdbc:mysql://locahost:3306/cartoon");
		dataSourse.setUsername("root");
		dataSourse.setPassword("1JT14IS044shadow");
		return dataSourse;
		
	}
	
}
