package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		System.out.print("Hello");
		SpringApplication.run(ExampleApplication.class, args);
	}

}
