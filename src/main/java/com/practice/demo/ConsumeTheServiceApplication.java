package com.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.client"})
public class ConsumeTheServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumeTheServiceApplication.class, args);
	}

}
