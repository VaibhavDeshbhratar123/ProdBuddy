package com.yourcodebuddy.prodbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdBuddyApplication.class, args);
		System.err.println("Application started successfully!");
	}

}
