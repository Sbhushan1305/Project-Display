package com.medicare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class MediCareSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediCareSpringBootApplication.class, args);
	}

}
