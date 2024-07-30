package com.example.L9_demo;

import com.example.L9_demo.model.Alien;
import com.example.L9_demo.model.Laptop;
import com.example.L9_demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class L9DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(L9DemoApplication.class, args);

		LaptopService service =context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

	}

}
