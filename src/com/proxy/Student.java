package com.proxy;

public class Student implements Person{
	private static Student student=null;
	public  static Student getInstance(){
		if(student==null)
			student=new Student();
		return student;
	}
	public Student(){
		System.out.println("我是一个学生");
	}
}
