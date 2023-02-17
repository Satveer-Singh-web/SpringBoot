package com.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {})
@EntityScan(basePackageClasses = {})
@EnableJpaRepositories(basePackages = {})
public class SpringBootJpaJan13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaJan13Application.class, args);
	}

}+