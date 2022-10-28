package com.te.learnspringcore.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	private Integer empId;
	private String empName;
	private Integer empAge;
	private Double empSalary;

	public Employee() {
		System.out.println("Employee()!");
	}

	public Employee(Integer empId, String empName, Integer empAge, Double empSalary) {
		System.out.println("Employee(Integer empId, String empName, Integer empAge, Double empSalary)!");
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public Integer getEmpId() {
		System.out.println("getEmpId()!");
		return empId;
	}

	public void setEmpId(Integer empId) {
		System.out.println("setEmpId(Integer empId)!");
		this.empId = empId;
	}

	public String getEmpName() {
		System.out.println("getEmpName()!");
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("setEmpName(String empName)!");
		this.empName = empName;
	}

	public Integer getEmpAge() {
		System.out.println("getEmpAge()!`");
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		System.out.println("setEmpAge(Integer empAge)!");
		this.empAge = empAge;
	}

	public Double getEmpSalary() {
		System.out.println("getEmpSalary()!");
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		System.out.println("setEmpSalary(Double empSalary)!");
		this.empSalary = empSalary;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode()!");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empAge == null) ? 0 : empAge.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empSalary == null) ? 0 : empSalary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals(Object obj)!");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAge == null) {
			if (other.empAge != null)
				return false;
		} else if (!empAge.equals(other.empAge))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSalary == null) {
			if (other.empSalary != null)
				return false;
		} else if (!empSalary.equals(other.empSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}

}
