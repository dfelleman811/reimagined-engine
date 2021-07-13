package com.revature.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication // allows auto configuration
@ComponentScan("com.revature") // alerts spring to look for components / stereotypes
@EnableJpaRepositories("com.revature.repos") // tells spring where our repos are
@EntityScan("com.revature.beans") // tells spring where our entities are
public class SpringBootDataApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootDataApplication.class);
    }

	// Comment to test automated continuous integration with github webhook
	//
}
