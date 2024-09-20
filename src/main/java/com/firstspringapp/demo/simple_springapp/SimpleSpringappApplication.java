package com.firstspringapp.demo.simple_springapp;

import com.firstspringapp.demo.simple_springapp.model.Address;
import com.firstspringapp.demo.simple_springapp.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringappApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!, first spring boot app");

		SpringApplication.run(SimpleSpringappApplication.class, args);

//		Employee employee = new Employee();
//		employee.empid = 123;
//		employee.name = "Sanjay";
//		employee.email ="sanjay123@gmail.com";
//
//
//		Address address = new Address();
//		address.doorno = 234;
//		address.streetname ="ahjixs";
//		address.city ="sueijsdnx";
//
//		employee.address = address;

		Employee employee = new Employee();
		employee.setEmpid(123);
		employee.setName("Sanjay");
		employee.setEmail("gajxnkm");
		employee.setAddress(new Address());

		Employee employee1 = new Employee(123,"sbxuj","agna@gmail.conm", new Address());
	}

}
