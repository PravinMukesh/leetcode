package practice;

import java.util.ArrayList;

class BinarySearchTree {
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	ArrayList<Integer> list = new ArrayList<>();

	class TreeNode {
		int val;
		TreeNode left, right;

		public TreeNode(int item) {
			val = item;
			left = right = null;
		}
	}

	static TreeNode root1;
	static TreeNode root2;

	void insert1(int key) {
		root1 = insertRec(root1, key);
	}

	void insert2(int key) {
		root2 = insertRec(root2, key);
	}

	TreeNode insertRec(TreeNode root, int key) {
		if (root == null) {
			root = new TreeNode(key);
			return root;
		}

		if (key < root.val)
			root.left = insertRec(root.left, key);
		else if (key > root.val)
			root.right = insertRec(root.right, key);

		return root;
	}

//	void inorder() {
//		inorderRec(root);
//	}
//
//	void inorderRec(Node root) {
//		if (root != null) {
//			inorderRec(root.left);
//			System.out.println(root.key);
//			inorderRec(root.right);
//		}
//	}

//	public void checkNullLeaf(Node root, Node root2) {
//		boolean answer = check(root, root2);
//	}
//
//	public boolean check(Node root, Node root2) {
//		if (root == null || root2 == null)
//			return false;
//		check(root.left, root2.left);
//		if (null == root.left && null == root.right) {
//			list.add(root.key);			
//		}
//		if (null == root2.left && null == root2.right ) {
//			list2.add(root2.key);	
//		}
//		check(root.right, root2.right);
//		return list.equals(list2);
//	}
//
//	public boolean compare(ArrayList<Integer> list, ArrayList<Integer> list2) {
//		return list.equals(list2);		
//	}

	public boolean check(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return false;
		list1 = findLeafNodes(root1);
		list = new ArrayList<Integer>();
		list2 = findLeafNodes(root2);
		return list1.equals(list2);
	}

	public ArrayList<Integer> findLeafNodes(TreeNode root) {
		if (null != root) {

			findLeafNodes(root.left);
			if (null == root.left && null == root.right) {
				list.add(root.val);
			}
			findLeafNodes(root.right);
		}
		return list;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		BinarySearchTree tree2 = new BinarySearchTree();
		tree.insert1(50);
		tree.insert1(30);
		tree.insert1(20);
//		tree.insert1(40);
//		tree.insert1(70);
//		tree.insert1(60);
//		tree.insert1(80);

		tree2.insert2(50);
		tree2.insert2(30);
		tree2.insert2(25);
		tree2.insert2(20);
//		tree2.insert2(40);
//		tree2.insert2(70);
//		tree2.insert2(71);
//		tree2.insert2(60);
//		tree2.insert2(80);
		System.out.println(tree.check(root1, root2));
		// tree2.checkNullLeaf(tree2);
		// tree.inorder();
	}
}
