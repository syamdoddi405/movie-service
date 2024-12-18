package com.movie.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.annotations.OpenAPI31;

@OpenAPI31
@OpenAPIDefinition
@SpringBootApplication(scanBasePackages = "com.movie.api.*")
@EnableJpaRepositories
public class MovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

}
