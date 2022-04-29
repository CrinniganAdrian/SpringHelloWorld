package com.ait.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class HelloService2 {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World 2022....VERSION 2";
	}
	
	@RequestMapping("/abc")
	public String index2() {
		return "Hello World 2022 abc....abc VERSION 2";
	}
}
