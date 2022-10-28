package com.te.learnspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.learnspringcore.entity.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		Employee employeeType = (Employee) applicationContext.getBean(Employee.class); // ByType
		
		Employee employee = (Employee) applicationContext.getBean("employee"); // ByName
		Employee employee_ = (Employee) applicationContext.getBean("employee");
		
		Employee employee2 = (Employee) applicationContext.getBean("employee2");
		Employee employee2_ = (Employee) applicationContext.getBean("employee2");
		
		System.out.println(employee == employee_);
		System.out.println(employee2 == employee2_);
		System.out.println(employee == employee2);
	}
}
