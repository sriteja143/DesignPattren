package com.constructional.singletone;

public class Employee {
	
	private static Employee emp = new Employee();
	
	public static Employee getEmployee() {
		return emp;
	}

}
