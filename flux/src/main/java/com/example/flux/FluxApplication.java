package com.example.flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.reactive.config.EnableWebFlux;


@EnableWebFlux
@EnableR2dbcRepositories
@EnableTransactionManagement
@SpringBootApplication
public class FluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluxApplication.class, args);
	}

}
