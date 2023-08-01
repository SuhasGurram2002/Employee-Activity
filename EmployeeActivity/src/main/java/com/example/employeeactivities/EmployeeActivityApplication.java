package com.example.employeeactivities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.employeeactivities")
public class EmployeeActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeActivityApplication.class, args);
	}

}
