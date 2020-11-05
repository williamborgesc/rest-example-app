package com.williamborgesc.restexampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestExampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExampleAppApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
		return restTemplateBuilder.defaultHeader("user-agent", "Code Club").build();
	}
}
