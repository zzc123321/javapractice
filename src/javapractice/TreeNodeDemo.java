package javapractice;

public class TreeNodeDemo {
	public static boolean compare(TreeNode pRoot1, TreeNode pRoot2) {
		 
        if (pRoot1 == null && pRoot2 == null)
            return true;
        if (pRoot1 == null || pRoot2 == null) {
            return false;
        }
        if (pRoot1.val != pRoot2.val)
            return false;
         
        return compare(pRoot1.left, pRoot2.right) && compare(pRoot1.right, pRoot2.left);
    }

	public static TreeNode mirror(TreeNode root){
		if(root == null){
			return null;
		}
		if((root.left == null) && (root.right == null)){
			return null;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);
		return root;
	}
	boolean isSymmetrical(TreeNode pRoot){
		return compare(pRoot,mirror(pRoot));
	}

}
