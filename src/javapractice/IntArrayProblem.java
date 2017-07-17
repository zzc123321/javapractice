package javapractice;

public class IntArrayProblem {
	private static int[][] copyArray(int[][] num){
		int[][] copy=new int[num.length][num[0].length];
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[0].length;j++){
				copy[i][j]=num[i][j];
			}
		}
		return copy;
	}
	//反转
	public static int[][] counterclockwise(int[][] num,int point){
		int[][] copy=copyArray(num);
		switch(point){
		case 1:
			num[0][0]=copy[0][1];
			num[0][1]=copy[1][1];
			num[1][0]=copy[0][0];
			num[1][1]=copy[1][0];
			break;
		case 2:
			num[0][1]=copy[0][2];
			num[0][2]=copy[1][2];
			num[1][1]=copy[0][1];
			num[1][2]=copy[1][1];
			break;
		case 3:
			num[1][0]=copy[1][1];
			num[1][1]=copy[2][1];
			num[2][0]=copy[1][0];
			num[2][1]=copy[2][0];
			break;
		case 4:
			num[1][1]=copy[1][2];
			num[1][2]=copy[2][2];
			num[2][1]=copy[1][1];
			num[2][2]=copy[2][1];
			break;
		}
		
		return num;
	}
	//正转
	public static int[][] clockwise(int[][] num,int point){
		int[][] copy=copyArray(num);
		switch(point){
		case 1:
			num[0][0]=copy[1][0];//+1 +0
			num[0][1]=copy[0][0];//+0 +1
			num[1][0]=copy[1][1];//+0 -1
			num[1][1]=copy[0][1];//-1 +0
			break;
		case 2:
			num[0][1]=copy[1][1];
			num[0][2]=copy[0][1];
			num[1][1]=copy[1][2];
			num[1][2]=copy[0][2];
			break;
		case 3:
			num[1][0]=copy[2][0];
			num[1][1]=copy[1][0];
			num[2][0]=copy[2][1];
			num[2][1]=copy[1][1];
			break;
		case 4:
			num[1][1]=copy[2][1];
			num[1][2]=copy[0][2];
			num[2][1]=copy[2][2];
			num[2][2]=copy[1][2];
			break;
		}
		
		return num;
	}
	public static void main(String args[]){
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int[][] b={{4,1,3},{5,2,6},{7,8,9}};
		System.out.println(counterclockwise(a,1).toString());
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println("a"+"["+i+"]["+j+"]="+a[i][j]);
				
//				System.out.println("b"+"["+i+"]["+j+"]="+b[i][j]);
			}
		}
		System.out.println(counterclockwise(a,1).toString());
	}
}
