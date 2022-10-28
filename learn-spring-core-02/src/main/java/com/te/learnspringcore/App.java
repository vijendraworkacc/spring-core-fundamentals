package com.te.learnspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.learnspringcore.entity.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);
	}
}
