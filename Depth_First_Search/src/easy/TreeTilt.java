package easy;

public class TreeTilt {
	
	static TreeNode root;
	static int leftSide;
	static int rightSide;
	static int sum;

	class TreeNode {
		Integer val;
		TreeNode left, right;

		TreeNode(Integer key) {
			this.val = key;
			this.left = right = null;
		}
	}
	
	public static int findTilt(TreeNode root) {
		if(null == root)
			return sum;
		if(null != root.left)
			leftSide = calculate(root.left);
		if(null != root.right)
			rightSide = calculate(root.right);
		return Math.abs(leftSide - rightSide);
	}
	
	public static int calculate(TreeNode root) {
		if(null != root.left && null != root.right)
			return root.val + root.left.val + root.right.val;
		if(null == root.left && null == root.right)
			return root.val;
		if(null != root.left)
			return root.val + root.left.val;
		if(null != root.right)
			return root.val + root.right.val;
		return 0;
	}

	public static void main(String[] args) {
		TreeTilt tilt = new TreeTilt();
//		root = tilt.new TreeNode(1);
//		root.left = tilt.new TreeNode(2);
////		root.left = null;
//		root.right = tilt.new TreeNode(3);
//		4,2,9,3,5,null,7
		root = tilt.new TreeNode(4);
		root.left = tilt.new TreeNode(2);
		root.right = tilt.new TreeNode(9);
		root.left.left = tilt.new TreeNode(3);
		root.left.right = tilt.new TreeNode(5);
		root.right.left = null;
		root.right.right = tilt.new TreeNode(7);
		// 21,7,14,1,1,2,2,3,3
//		root = tilt.new TreeNode(21);
//		root.left = tilt.new TreeNode(7);
//		root.right = tilt.new TreeNode(14);
//		root.left.left = tilt.new TreeNode(1);
//		root.left.right = tilt.new TreeNode(1);
//		root.right.left = tilt.new TreeNode(2);
//		root.right.right = tilt.new TreeNode(2);
//		root.left.left.left = tilt.new TreeNode(3);
//		root.left.left.right = tilt.new TreeNode(3);

		System.out.println(findTilt(root));
	}

}
