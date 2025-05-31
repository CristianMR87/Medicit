package com.cristian.citasmedicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.cristian.citasmedicas.model")
public class MedicitApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicitApplication.class, args);
	}

}
