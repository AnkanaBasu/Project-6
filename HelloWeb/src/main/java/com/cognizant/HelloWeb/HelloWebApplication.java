package com.cognizant.HelloWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant")
public class HelloWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWebApplication.class, args);
	}

}
