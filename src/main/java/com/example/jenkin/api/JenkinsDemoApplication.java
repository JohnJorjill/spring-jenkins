package com.example.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
