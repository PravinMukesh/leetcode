package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

	static TreeNode root;
	StringBuffer sb = new StringBuffer();
	ArrayList<String> list = new ArrayList<String>();
	Integer parentNode;
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int key) {
			this.val = key;
		}
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	public TreeNode insertRec(TreeNode root, int key) {
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

//	public List<String> binaryTreePaths(TreeNode root) {
//		if (root == null) {
//			return new ArrayList<String>();
//		}
//		if (null == root.left && null == root.right) {
//			sb.append(root.val);
//			list.add(sb.toString());
//			sb = new StringBuffer();
//		}
//		if (null != root.left || null != root.right) {
//			parentNode = root.val;
//			sb.append(root.val + "->");
//		}
//		if (null != root.left) {
//			binaryTreePaths(root.left);
//		}
//		if (null != root.right) {
//			binaryTreePaths(root.right);
//		}
//		return list;
//	}

	public List<String> binaryTreePaths(TreeNode root) {
		if (root == null)
			return new ArrayList<String>();
		if(sb.length() == 0)
			sb.append(root.val);
		else
			sb.append("->"+root.val);
		int length = sb.length();
		if(null == root.left && null == root.right)
			list.add(sb.toString());
		if(null != root.left)
			binaryTreePaths(root.left);
		sb.setLength(length);
		if(null != root.right)
			binaryTreePaths(root.right);
		return list;
	}

	public static void main(String[] args) {

		BinaryTreePath path = new BinaryTreePath();
		path.insert(40);
		path.insert(20);
		path.insert(30);
		path.insert(50);
		// path.insert(30);

		System.out.println(path.binaryTreePaths(root));
	}

}
