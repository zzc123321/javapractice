package com.stringTest;

import java.util.Scanner;

/**
 * ţţ��úڻ���,��Ҫ�ݻٵ����򡣵��������˿�����������������롣ţţ������һ���ַ���S,ţţ���ǵô�S��ȥ��һ���ַ���ǡ������ȷ������,�����ţţ����������Ҫ���Զ��ٴ����롣
��������ʾS = "ABA",3�����ܵ�������"BA", "AA", "AB".
��S = "A", ţţΨһ���Գ��Ե�������һ���յ�����,�������1. 
��������:
�������һ���ַ���S,�ַ�������length(1 �� length �� 50),���ж��Ǵ�'A'��'Z'�Ĵ�д��ĸ��


�������:
���һ������,��ʾţţ�����Ҫ���Ե����������

��������1:
ABA

�������1:
3
 */
public class PassWordProblem {
	private static Scanner scan;
	public static int testTimes(String s){
	/**
	 * AAAB 2
	 * ABCD 4
	 * AABC 3
	 */
		int reaptNum=0;
		char[] ss=s.toCharArray();
	for(int i=1;i<s.toCharArray().length;i++){
		if(ss[i-1]==ss[i]){
			reaptNum++;
		}
	}
	return s.toCharArray().length-reaptNum;
	}
public static void main(String[] args) {
	scan = new Scanner(System.in);
	while(scan.hasNext()){
		String s=scan.nextLine();
//		String s="BBBBW";
		System.out.println(testTimes(s));
	}
}
}
