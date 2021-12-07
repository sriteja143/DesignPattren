package com.constructional.singletone;

public class Student {
	private static Student stu;
	private Student() {}
	
	public static Student getStudent() {
		if(stu == null) {
			stu = new Student();
		}
		return stu;
	}
}
