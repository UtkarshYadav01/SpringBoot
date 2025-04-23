package com.ucode.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject3Application.class, args);
	}

	// CommandLineRunner bean to execute some code after application start
	@Bean
	public CommandLineRunner run() {
		return A-> myClass().printMessage("Bittu");
	}
	
	@Bean
	public MyClass myClass() {
		return new MyClass();
	}

}
