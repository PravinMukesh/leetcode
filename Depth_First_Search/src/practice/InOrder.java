package practice;

public class InOrder {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;
	Node finalValue;

	void insert(int key) {
		root = insertCheck(root, key);
	}

	Node insertCheck(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertCheck(root.left, key);
		else if (key > root.key)
			root.right = insertCheck(root.right, key);
		return root;
	}

	Node insertRec(Node root, int key) {

		if (root.left == null && root.right == null) {
			finalValue = new Node(key);
			finalValue.left = null;
			return finalValue;
		}
		if(root.left.key == finalValue.key) {
			finalValue.right = new Node(key);
			finalValue.left = null;
			return finalValue;
		}
		return finalValue;
	}

	void inorder() {
		inorderRec(root);
	}

	Node inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			insertRec(root, root.key);
			inorderRec(root.right);
		}
		return finalValue;
	}

	public static void main(String[] args) {
		InOrder tree = new InOrder();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();
	}

}
