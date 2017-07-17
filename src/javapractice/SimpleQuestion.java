package javapractice;

public class SimpleQuestion {
	static boolean yesOrNo(String s){
		s=s.toLowerCase();
		return s.equals("yes")||s.equals("y")||s.equals("true")||s.equals("t");
	}
	public static void main(String args[]){
		System.out.println(yesOrNo("true")+""+yesOrNo("Yes"));
	}
}
