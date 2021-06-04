package easy;

import java.util.ArrayList;

public class SameTree {

	static TreeNode root;
	static TreeNode p, q;
	static ArrayList<Integer> list1 = new ArrayList<>();
	static ArrayList<Integer> list2 = new ArrayList<>();

	class TreeNode {
		Integer val;
		TreeNode left, right;

		TreeNode(Integer key) {
			this.val = key;
			this.left = right = null;
		}
	}

	public void insert1(Integer key) {
		p = insertRecP(p, key);
		// q = insertRecQ(q, key);
		// insert(p,q);
	}

	public void insert2(Integer key) {
		q = insertRecQ(q, key);
	}

	public TreeNode insertRecP(TreeNode root, Integer key) {
		if (null == root) {
			root = new TreeNode(key);
			return root;
		}
		if (key < root.val)
			root.left = insertRecP(root.left, key);
		else if (key > root.val)
			root.right = insertRecP(root.right, key);
		return root;
	}

	public TreeNode insertRecQ(TreeNode root, Integer key) {
		if (null == root) {
			root = new TreeNode(key);
			return root;
		}
		if (key != null && key < root.val)
			root.left = insertRecQ(root.left, key);
		else if (key != null && key > root.val)
			root.right = insertRecQ(root.right, key);
		return root;
	}

//	public static boolean insert(TreeNode p, TreeNode q) {
//		if (p == null && q == null)
//			return false;
//		if (null != p && null != q && p.val == q.val) {
//		//	insert(p.left, q.left);
//			insert(p.right, q.right);
//			return true;
//		} else {
//			return false;
//		}
////			if ((null != p.left && null != q.left) && (p.left.val == q.left.val))
////				if ((null != p.right && null != q.right) && (p.right.val == q.right.val))
//		//return false;
//	}

	public static boolean insert(TreeNode p, TreeNode q) {

		if (null != p) {
			list1.add(p.val);
			if (null != p.left)
				insert(p.left, null);
			else
				list1.add(null);
			if (null != p.right)
				insert(p.right, null);
			else
				list1.add(null);
		}
		if (null != q) {
			list2.add(q.val);
			if (null != q.left)
				insert(null, q.left);
			else
				list2.add(null);
			if (null != q.right)
				insert(null, q.right);
			else
				list2.add(null);
		}
		return list1.equals(list2);
	}

	public static void main(String[] args) {
		SameTree st = new SameTree();
		SameTree st1 = new SameTree();
//		 st.insert1(1);
//		 st.insert1(null);
//		 st.insert1(2);
//
//		 st1.insert2(1);
//		 st1.insert2(2);
//		 st1.insert2(3);
		p = st.new TreeNode(1);
		p.left = st.new TreeNode(2);
		p.right = null;
		q = st.new TreeNode(1);
		q.left = null;
		q.right = st.new TreeNode(2);
		System.out.println(insert(p, q));
	}

}
