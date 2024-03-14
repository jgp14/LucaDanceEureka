package com.lucatic.grupo2.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LucaDanceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaDanceEurekaApplication.class, args);
	}

}
