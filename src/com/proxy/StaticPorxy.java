package com.proxy;

public class StaticPorxy {
	public static Teacher getTeacher(){
		return Teacher.getInstance();
	}
	public static Student getStudent(){
		return Student.getInstance();
	}
}
