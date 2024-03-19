package com.lucatic.grupo2.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Clase principal del Eureka
 *
 * @author BlueDevTeam
 * @version 1.0.0
 * @since 15-03-2024
 */
@SpringBootApplication
@EnableEurekaServer
public class LucaDanceEurekaApplication {

	/**
	 * Punto de entrada al programa principal del EurekaServer
	 * 
	 * @param args Argumentos por línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(LucaDanceEurekaApplication.class, args);
	}

}
