package com.greenstitch.pract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller","service","model", "repository"})
public class PractApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractApplication.class, args);
	}

}
