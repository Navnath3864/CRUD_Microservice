package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.client.model.Student;
@EnableDiscoveryClient
@SpringBootApplication
public class ClientCreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientCreateApplication.class, args);
		System.out.println("Create-8081");

	}
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}

}
