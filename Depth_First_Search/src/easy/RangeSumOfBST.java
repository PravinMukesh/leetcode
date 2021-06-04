package easy;

public class RangeSumOfBST {
	static TreeNode root;
	int temp = 0;

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public void insert(int key) {
		root = stackIt(root, key);
	}

	public TreeNode stackIt(TreeNode root, int key) {
		if (root == null) {
			root = new TreeNode(key);
			return root;
		}
		if (key < root.val) {
			root.left = stackIt(root.left, key);
		} else if (key > root.val) {
			root.right = stackIt(root.right, key);
		}
		return root;
	}

	public int rangeSumBST(TreeNode root, int low, int high) {

		if (root == null) {
			return 0;
		}
		if (low <= root.val && high >= root.val)
			temp += root.val;
		if (low < root.val)
			rangeSumBST(root.left, low, high);
		if (high > root.val)
			rangeSumBST(root.right, low, high);

		return temp;
	}

	public static void main(String[] args) {
		RangeSumOfBST bst = new RangeSumOfBST();
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(3);
		bst.insert(7);
		// bst.insert(null);
		bst.insert(18);
		System.out.println(bst.rangeSumBST(root, 7, 15));
	}
}
