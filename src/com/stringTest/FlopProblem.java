package com.stringTest;

import java.util.Scanner;

/**
 * ţţ��n�ſ�Ƭ�ų�һ������.ÿ�ſ�Ƭһ���Ǻ�ɫ��,��һ���ǰ�ɫ�ġ���ʼ״̬��ʱ����Щ��Ƭ�Ǻ�ɫ����,��Щ��Ƭ�ǰ�ɫ���ϡ�ţţ������Ҫ��һЩ��Ƭ������,�õ�һ�ֽ������е���ʽ,��ÿ�����ڿ�Ƭ����ɫ���ǲ�һ���ġ�ţţ��֪��������Ҫ��ת�����ſ�Ƭ���Ա�ɽ������е���ʽ�� 
��������:
�������һ���ַ���S,�ַ�������length(3 �� length �� 50),����ֻ����'W'��'B'�����ַ���,�ֱ��ʾ��ɫ�ͺ�ɫ�������ַ�����ʾ��Ƭ���еĳ�ʼ״̬��


�������:
���һ������,��ʾţţ�����Ҫ��ת�Ĵ�����

��������1:
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
