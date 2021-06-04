package easy;

public class InOrderTraversal {
	static TreeNode root;
	static TreeNode curr;
	static class TreeNode {
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

	public static TreeNode InOrderTraversal(TreeNode root) {
		TreeNode ans = new TreeNode();
		curr = ans;
		inOrder(root);
		return ans.right;
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
	
	public void insertForInorder() {
			inOrder(root);
	}
	
	public static void inOrder(TreeNode root) {
		if(root == null)
			return;
		inOrder(root.left);
		root.left = null;
		curr.right = root;
		curr = root;
		inOrder(root.right);
	}

	public static void main(String[] args) {
		InOrderTraversal tree = new InOrderTraversal();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		InOrderTraversal(root);
	//	tree.insertForInorder();
	}
}
