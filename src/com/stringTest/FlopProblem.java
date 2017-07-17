package com.stringTest;

import java.util.Scanner;

/**
 * 牛牛有n张卡片排成一个序列.每张卡片一面是黑色的,另一面是白色的。初始状态的时候有些卡片是黑色朝上,有些卡片是白色朝上。牛牛现在想要把一些卡片翻过来,得到一种交替排列的形式,即每对相邻卡片的颜色都是不一样的。牛牛想知道最少需要翻转多少张卡片可以变成交替排列的形式。 
输入描述:
输入包括一个字符串S,字符串长度length(3 ≤ length ≤ 50),其中只包含'W'和'B'两种字符串,分别表示白色和黑色。整个字符串表示卡片序列的初始状态。


输出描述:
输出一个整数,表示牛牛最多需要翻转的次数。

输入例子1:
BBBW
 * @author zzc
 *
 */
public class FlopProblem {
	public static int countTimes(String s){
	    char[] ss=s.toCharArray();
	    char[] s2=s.toCharArray();
	    int changeNum=0;
	    int changeNum2=0;
	    for(int i=1;i<ss.length;i++){
	    	if('W'==ss[i-1]&&'W'==ss[i]){
	    		ss[i]='B';
	    		changeNum++;
	    	}else if('B'==ss[i-1]&&'B'==ss[i]){
	    		ss[i]='W';
	    		changeNum++;
	    	}
	    }
	    for(int i=s2.length-1;i>0;i--){
	    	if('W'==s2[i-1]&&'W'==s2[i]){
	    		s2[i-1]='B';
	    		changeNum2++;
	    	}else if('B'==s2[i-1]&&'B'==s2[i]){
	    		s2[i-1]='W';
	    		changeNum2++;
	    	}
	    }
	    return Math.min(changeNum, changeNum2);
	}
	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s=scan.nextLine();
//			String s="BBBBW";
			System.out.println(countTimes(s));
		}
		
//		String s="BBBBW";
//		System.out.println(countTimes(s));
	}
}
