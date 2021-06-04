package easy;

public class MaxDepth {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int key) {
			this.val = key;
		}
	}

	static TreeNode root;
	static int counter;
	int parentNode;
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

	public int findMaxDepth(TreeNode root) {
		if (root == null)
			return counter;
		if (root != null) {
			if (null == root.left && null == root.right)
				counter++;
			count(root);
			findMaxDepth(root.left);
			findMaxDepth(root.right);
		}
		return counter;
	}

	public int count(TreeNode root) {
		if (null != root.left || null != root.right)
			return counter++;
		return counter;
	}

	public static void main(String[] args) {
		MaxDepth max = new MaxDepth();
		max.insert(50);
		max.insert(30);
		max.insert(20);
		max.insert(40);
//		max.insert(70);
//		max.insert(60);
//		max.insert(80);

		System.out.println(max.findMaxDepth(root));
	}

}
