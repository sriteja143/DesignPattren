package com.constructional.singletone;

public class SingletoneTest {

	public static void main(String[] args) {
		Employee e = Employee.getEmployee();
		Employee e1 = new Employee();
		
		System.out.println(e.hashCode());
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		
		
		System.out.println("LAZY LOADING");
		System.out.println();
		Student stu = Student.getStudent();
		Student stu1 = Student.getStudent();
		
		System.out.println(stu);
		System.out.println(stu1);
		
	}

}


