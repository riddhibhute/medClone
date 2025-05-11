package com.example.medClone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.medClone.entity")
@EnableJpaRepositories(basePackages = "com.example.medClone.repo")
public class MedCloneApplication {
	public static void main(String[] args) {
		SpringApplication.run(MedCloneApplication.class, args);
	}
}

