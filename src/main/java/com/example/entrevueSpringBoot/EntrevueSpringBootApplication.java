package com.example.entrevueSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.*;

/*@ComponentScan(basePackages = { "package objects.*" })
@EntityScan("objects.*")*/

@SpringBootApplication
public class EntrevueSpringBootApplication {

	public static void main(String... args) {
		run(EntrevueSpringBootApplication.class, args);
	}
}