package com.te.learnspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.learnspringcore.config.BeanConfigurations;
import com.te.learnspringcore.entity.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfigurations.class);

		Employee employee = (Employee) applicationContext.getBean("employee01");
		Employee employee_ = (Employee) applicationContext.getBean("employee01");
		
		System.out.println(employee.hashCode());
		System.out.println(employee_.hashCode());
		System.out.println(employee == employee_);

	}
}
