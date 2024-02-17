package com.grow.technical.jenkinsintegration;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsIntegrationApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(JenkinsIntegrationApplication.class);

	@PostConstruct
	public void init(){
		LOGGER.info("Jenkins Integration application main INIT POSTCONSTRUCT method");
	}

	public static void main(String[] args) {
		LOGGER.info("Jenkins Integration application MAIN method");
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}

}
