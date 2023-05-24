package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Employee;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})


@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@Controller
public class EmpController {
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm()
	{
		return "addemp";
	}
	
	@PostMapping("/register")
	public String empRegister (@ModelAttribute Employee e) {
		System.out.println(e);
		return "addemp";
	}
	
	
}
