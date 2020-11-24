package com.example.demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo4Application {
	@GetMapping(value="/hello")
	public String getmap(){
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

}
