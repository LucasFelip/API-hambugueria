package com.am.hambuqueria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HambuqueriaApplication {
	public static void main(String[] args) {
		SpringApplication.run(HambuqueriaApplication.class, args);
	}
}