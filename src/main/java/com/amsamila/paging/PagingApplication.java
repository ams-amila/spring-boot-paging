package com.amsamila.paging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class PagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagingApplication.class, args);
	}
}
