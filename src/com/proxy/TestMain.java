package com.proxy;

public class TestMain {
public static void main(String[] args) {
	//��̬����
//	StaticPerson.getStudent();
//	StaticPerson.getTeacher();
	//��̬����
	DynamicProxy proxy=new DynamicProxy();
	Person student=(Person) proxy.newProxyInstance(new Student());
	Person teacher=(Person) proxy.newProxyInstance(new Teacher());
}
}
