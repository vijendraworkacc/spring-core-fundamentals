package com.te.learnspringcore.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.learnspringcore.entity.Address;
import com.te.learnspringcore.entity.Employee;

@Configuration // @Component + Configuration metadata
@ComponentScan(basePackages = "com.te.learnspringcore")
public class BeanConfigurations {

	@Bean(name = "address01")
	public Address getAddressBean() {
		Address address = new Address();
		address.setAddressCity("CITY");
		address.setAddressCountry("INDIA");
		address.setAddressType("TEMP");
		return address;
	}

	@Primary
	@Bean(name = "address02")
	public Address getAddressBean_() {
		Address address = new Address();
		address.setAddressCity("BANGALORE");
		address.setAddressCountry("INDIA");
		address.setAddressType("PERM");
		return address;
	}

	@Scope(value = "prototype")
	@Bean(name = "employee01")
	public Employee getEmpBean() {
		Employee employee = new Employee();
		employee.setEmpId(12);
		employee.setEmpAge(22);
		employee.setEmpName("Name01");
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		employee.setEmpFriends(list);
		return employee;
	}
}
