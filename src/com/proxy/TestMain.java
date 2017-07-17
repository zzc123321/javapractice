package com.proxy;

public class TestMain {
public static void main(String[] args) {
	//静态调用
//	StaticPerson.getStudent();
//	StaticPerson.getTeacher();
	//动态调用
	DynamicProxy proxy=new DynamicProxy();
	Person student=(Person) proxy.newProxyInstance(new Student());
	Person teacher=(Person) proxy.newProxyInstance(new Teacher());
}
}
