package javapractice.tree;

import javapractice.TreeNode;

public class BanlanceTree {
	public static int getHeight(TreeNode root){
		if(root==null) return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
	public static boolean isBalanced(TreeNode root){
		if(root==null) return true;
		int heightDiff=getHeight(root.left)-getHeight(root.right);
		if(Math.abs(heightDiff)>1){
			return false;
		}else{
			return isBalanced(root.left)&&isBalanced(root.right);
		}
	}
	public static void main(String args[]){
		int i=0,j=0;
		TreeNode root=new TreeNode(0);
		while(i>10){
			TreeNode treeNode=new TreeNode(i);
			root.left=treeNode;
			i++;
		}
	}
}
