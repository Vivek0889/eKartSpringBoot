//https://www.boraji.com/spring-boot-creating-web-application-using-spring-mvc

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class EKartSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EKartSpringBootApplication.class, args);
	}

}
