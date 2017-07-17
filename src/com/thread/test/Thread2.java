package com.thread.test;
/**
 *      二、然而，当一个线程访问object的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该object中的非synchronized(this)同步代码块。
 * @author zzc
 *
 */
public class Thread2 implements Runnable {

		  public void m4t1() {  
	          synchronized(this) {  
	               int i = 5;  
	               while( i-- > 0) {  
	                    System.out.println(Thread.currentThread().getName() + " : " + i);  
	                    try {  
	                         Thread.sleep(500);  
	                    } catch (InterruptedException ie) {  
	                    }  
	               }  
	          }  
	     }  
	     public void m4t2() {  
	          int i = 5;  
	          while( i-- > 0) {  
	               System.out.println(Thread.currentThread().getName() + " : " + i);  
	               try {  
	                    Thread.sleep(500);  
	               } catch (InterruptedException ie) {  
	               }  
	          }  

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread2 t2=new Thread2();
		Thread ta=new Thread(new Runnable() {  public void run() {  t2.m4t1();  }  }, "A");
		Thread tb=new Thread(new Runnable() {  public void run() {  t2.m4t2();  }  }, "B");
		ta.start();
		tb.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
