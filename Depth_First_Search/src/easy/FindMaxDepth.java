package easy;

import easy.FindMinDepth.TreeNode;

public class FindMaxDepth {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int key) {
			this.val = key;
		}
	}

	static TreeNode root;
	int leftNode;
	int rightNode;

	public void insert(int key) {
		root = insertRec(root, key);
	}

	public TreeNode insertRec(TreeNode root, int key) {
		if (root == null) {
			root = new TreeNode(key);
			return root;
		}
		if (key < root.val) {
			root.left = insertRec(root.left, key);
		}else if (key > root.val) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	public int seperateFirstElement(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(seperateFirstElement(root.left), seperateFirstElement(root.right))+1;
	}

	public static void main(String[] args) {
		FindMaxDepth max = new FindMaxDepth();
//		max.insert(50);
//		max.insert(30);
//		max.insert(20);
//		max.insert(40);
//		max.insert(70);
//		max.insert(60);
//		max.insert(80);
//		max.insert(100);
		
//		max.insert(9);
//		max.insert(3);
//		max.insert(20);
//		max.insert(11);
//		max.insert(22);
		
//		root = max.new TreeNode(2);
//		root.left = null;
//		root.right = max.new TreeNode(3);
//		root.right.left = null;
//		root.right.right = max.new TreeNode(4);
//		root.right.right.left = null;
//		root.right.right.right = max.new TreeNode(5);
//		root.right.right.right.left = null;
//		root.right.right.right.right = max.new TreeNode(6);
		
		//3,9,20,null,null,15,7
		root = max.new TreeNode(3);
		root.left = max.new TreeNode(9);
		root.right = max.new TreeNode(20);
		root.left.left = null;
		root.left.right = null;
		root.right.left = max.new TreeNode(15);
		root.right.right = max.new TreeNode(7);
		System.out.println(max.seperateFirstElement(root));
	}

}
