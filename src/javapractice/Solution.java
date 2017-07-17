package javapractice;

public class Solution {
	public static int number1(int n){
		String str=Integer.toBinaryString(n);
		int count=0;
		char[] cs=str.toCharArray();
		for(char c:cs){
			String temp=String.valueOf(c);
			if("1".equals(temp)){
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]){
		int i=number1(1);
		System.out.println(i);
	}
}
