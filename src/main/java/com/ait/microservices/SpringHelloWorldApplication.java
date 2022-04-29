package com.ait.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringHelloWorldApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWorldApplication.class, args);
		System.out.print("Hello World 2022");
	}

}
