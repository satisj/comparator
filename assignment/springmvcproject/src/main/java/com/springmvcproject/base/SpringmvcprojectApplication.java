package com.springmvcproject.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springmvcproject.base.configuration",
		"com.springmvcproject.base.controller",
		"com.springmvcproject.base.dao",
		"com.springmvcproject.base.dto",
		"com.springmvcproject.base.service"})
public class SpringmvcprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcprojectApplication.class, args);
	}

}
