package easy;

import easy.FindMaxDepth.TreeNode;

public class FindMinDepth {

	static TreeNode root;
	static int counter;

	class TreeNode {
		Integer val;
		TreeNode left, right;

		TreeNode(Integer key) {
			this.val = key;
			this.left = right = null;
		}
	}

	public static int minDepth(TreeNode root) {
		if (null == root)
			return 0;
		if (null != root)
			counter += Math.min(minDepth(root.left), minDepth(root.right))+1;
		return counter;
	}

	public static void main(String[] args) {
		FindMinDepth min = new FindMinDepth();

//		root = min.new TreeNode(2);
//		root.left = null;
//		root.right = min.new TreeNode(3);
//		root.right.left = null;
//		root.right.right = min.new TreeNode(4);
//		root.right.right.left = null;
//		root.right.right.right = min.new TreeNode(5);
//		root.right.right.right.left = null;
//		root.right.right.right.right = min.new TreeNode(6);

		root = min.new TreeNode(3);
		root.left = min.new TreeNode(9);
		root.right = min.new TreeNode(20);
		root.left.left = null;
		root.left.right = null;
		root.right.left = min.new TreeNode(15);
		root.right.right = min.new TreeNode(7);

//		root = min.new TreeNode(5);

		System.out.println(minDepth(root));
	}

}
