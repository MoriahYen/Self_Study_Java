package com.example.L9_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class L9DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(L9DemoApplication.class, args);

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
