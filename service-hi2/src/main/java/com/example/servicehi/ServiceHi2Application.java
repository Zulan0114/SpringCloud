package com.example.servicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHi2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHi2Application.class, args);
	}

}

