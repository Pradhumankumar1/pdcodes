package com.pdcodingshuttle.pdcodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdcodesApplication implements CommandLineRunner {
//	@Autowired
//	Apple apple1;
//	@Autowired
//	Apple apple2;
	@Autowired
	DBService dbService;

	public static void main(String[] args) {

		SpringApplication.run(PdcodesApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbService.getData());
//		apple1.eatApple();
//		apple2.eatApple();
	}
}
