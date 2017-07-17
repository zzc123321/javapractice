package com.thread.test;
/**
 *   三、尤其关键的是，当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞
 * @author zzc
 *
 */
public class Thread3 implements Runnable {
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
    	synchronized(this) { 
    		  int i = 5;  
    	         while( i-- > 0) {  
    	              System.out.println(Thread.currentThread().getName() + " : " + i);  
    	              try {  
    	                   Thread.sleep(500);  
    	              } catch (InterruptedException ie) {  
    	              }  
         } 
    	}}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread3 t2=new Thread3();
		Thread ta=new Thread(new Runnable() {  public void run() {  t2.m4t1();  }  }, "A");
		Thread tb=new Thread(new Runnable() {  public void run() {  t2.m4t2();  }  }, "B");
		ta.start();
		tb.start();
	}

}
