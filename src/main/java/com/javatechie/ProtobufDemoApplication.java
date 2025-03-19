package com.javatechie;

import con.javatechie.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProtobufDemoApplication {

	public static void main(String[] args) {

//		Employee.newBuilder()
//						.setId(101)
//								.setName("Basant");
		SpringApplication.run(ProtobufDemoApplication.class, args);
	}

}
