package com.fds.services.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories("com.fds.services.repository")
@ComponentScan({"com.fds.services.controller"})
public class FdsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FdsServiceApplication.class, args);
	}

}
