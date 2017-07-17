package javapractice;

public class ChangeStringToOtherCase {
	public static String changeCase(String str){
		StringBuffer result=new StringBuffer();
		char[] cs=str.toCharArray();
		for(char c:cs){
			String temp="";
			if(Character.isLowerCase(c)){
				temp=String.valueOf(Character.toUpperCase(c));
			}else if(Character.isUpperCase(c)){
				temp=String.valueOf(Character.toLowerCase(c));
			}else{
				return null;
			}
			result.append(temp);
		}
				
		return result.toString();
		
	}
	public static String[] sprateSpace(String str){
		String[] strs=str.split(" ");
		if(strs.length>0){
			return strs;
		}else{
			return null;
		}
	}
	public static String printUpDown(String str){
		StringBuffer result=new StringBuffer();
		char[] cs=str.toCharArray();
		if(cs.length>0){
			int end=cs.length;
			for(int i=end-1;i>=0;i--){
				result.append(String.valueOf(cs[i]));
			}
		}else{
			return null;
		}
		return result.toString();
	}
	public static void main(String args[]){
		String str="Hello world";
		String[] strs=sprateSpace(str);
		String caseStr="";
		String result="";
		for(String s:strs){
			caseStr+=changeCase(s);
		}
		result=printUpDown(caseStr);
		System.out.println(result);
	}
}
