package com.stringTest;

import java.util.Scanner;

/**
 * 牛牛变得黑化了,想要摧毁掉地球。但他忘记了开启地球毁灭器的密码。牛牛手里有一个字符串S,牛牛还记得从S中去掉一个字符就恰好是正确的密码,请你帮牛牛求出他最多需要尝试多少次密码。
如样例所示S = "ABA",3个可能的密码是"BA", "AA", "AB".
当S = "A", 牛牛唯一可以尝试的密码是一个空的密码,所以输出1. 
输入描述:
输入包括一个字符串S,字符串长度length(1 ≤ length ≤ 50),其中都是从'A'到'Z'的大写字母。


输出描述:
输出一个整数,表示牛牛最多需要尝试的密码次数。

输入例子1:
ABA

输出例子1:
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
