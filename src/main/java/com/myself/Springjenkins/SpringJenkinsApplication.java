package com.myself.Springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
		
		Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
		
		
		logger.info("Log Statement1");
		logger.info("Log Statement2");
	}

}
