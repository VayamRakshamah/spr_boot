package com.test.spr_boot.spr_boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SprBootApplication.class, args);
	}

	@Override
	public void run(String... args){
		System.out.println("Hello World");
	}

}
