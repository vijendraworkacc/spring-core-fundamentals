package com.te.learnspringcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.learnspringcore.entity.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");

		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);

	}
}
