package com.webApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ResatApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ResatApplication.class, args);
	}

}
