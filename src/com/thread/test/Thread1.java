package com.thread.test;
/**
 *    һ�������������̷߳���ͬһ������object�е����synchronized(this)ͬ�������ʱ��һ��ʱ����ֻ����һ���̵߳õ�ִ�С���һ���̱߳���ȴ���ǰ�߳�ִ�������������Ժ����ִ�иô���顣
 * @author zzc
 *
 */
public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		  synchronized(this) {  
              for (int i = 0; i < 5; i++) {  
                   System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);  
              }  
         }  
	}
	 public static void main(String[] args) {  
         Thread1 t1 = new Thread1();  
         Thread ta = new Thread(t1, "A");  
         Thread tb = new Thread(t1, "B");  
         ta.start();  
         tb.start();  
    } 

}
