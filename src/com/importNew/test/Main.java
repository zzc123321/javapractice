package com.importNew.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCallBack().compute(1000,new ComputeCallBack(){
			public void onComputeEnd(){
				System.out.println("end back!!");
			

			}
		});
	}

}
