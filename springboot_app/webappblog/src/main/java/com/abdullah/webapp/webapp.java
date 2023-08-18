package com.abdullah.webapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.abdullah.webapp")
@SpringBootApplication 
@EnableJpaRepositories(basePackages = "com.abdullah.webapp.IRepositoriesDal")
@EntityScan(basePackages = "com.abdullah.webapp.models")
public class webapp extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(webapp.class);
	}

}
