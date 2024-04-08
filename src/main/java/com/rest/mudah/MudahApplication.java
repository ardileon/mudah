package com.rest.mudah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rest.mudah")
public class MudahApplication {

	public static void main(String[] args) {
		SpringApplication.run(MudahApplication.class, args);
	}

}
