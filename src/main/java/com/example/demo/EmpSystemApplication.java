package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.EmpController;


@SpringBootApplication
@ComponentScan(basePackageClasses = EmpController.class)
public class EmpSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpSystemApplication.class, args);
	}

}
