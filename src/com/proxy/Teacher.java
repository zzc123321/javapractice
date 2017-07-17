package com.proxy;

public class Teacher implements Person{
	private static Teacher teacher=null;
	public static  Teacher getInstance(){
		if(teacher==null){
			teacher=new Teacher();
		}
		
		return teacher;
	}
 public Teacher(){
	 System.out.println("我是一个老师");
 }
}
