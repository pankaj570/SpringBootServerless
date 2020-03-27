package com.dell.serverless.controller;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FunctionController {
	@Bean
	public Function<Employee, Employee> function() {
		return employee -> employee;
	}

	@Bean
	public Consumer<Employee> consumer() {
		return employee -> {
			System.out.println("consume data :: " + employee);
		};
	}
	
	@Bean
	public Supplier<Employee> supplier(){
		return ()->{
			Employee emp = new Employee();
			emp.setId("101");
			emp.setName("Pankaj Kumar Singh");
			return emp;
		};
	}

}
