package easy;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDistanceBST {

	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<Integer> finalValue = new ArrayList<>();
	static TreeNode root;

	class TreeNode {
		int val;
		TreeNode left, right;

		public TreeNode(int key) {
			this.val = key;
		}
	}

	public void insert(Integer key) {
		root = insertRec(root, key);
	}

	public TreeNode insertRec(TreeNode root, Integer key) {
		if (root == null) {
			root = new TreeNode(key);
			return root;
		}
		if (null != key && key < root.val) {
			root.left = insertRec(root.left, key);
		}
		if (null != key && key > root.val) {
			root.right = insertRec(root.right, key);
		}

		return root;
	}

	public int difference(TreeNode root) {
		if (null == root)
			return list.get(0);
		if (null != root) 
			list = saveInList(root);
		return calculateHelper(list);
	}
	
		public ArrayList<Integer> saveInList(TreeNode root){
			if(root == null)
				return list;
			if(null != root.left || null != root.right)
				list.add(root.val);
			if(null == root.left && null == root.right)
				list.add(root.val);
			saveInList(root.left);
			saveInList(root.right);
			return list;
		}
		
		public int calculateHelper(ArrayList<Integer> values) {
			Collections.sort(list);
			for(int i = values.size()-1; i >= 0; i--) {
				for(int j = 0; j < values.size(); j++) {
					if(values.get(i) != values.get(j)) {
						finalValue.add(values.get(i) - values.get(j));
					} else {
						break;
					}
				}
			}
			Collections.sort(finalValue);
			return finalValue.get(0);
		}

	public static void main(String[] args) {
		MinimumDistanceBST minBST = new MinimumDistanceBST();

//		minBST.insert(90);
//		minBST.insert(69);
//		minBST.insert(null);
//		minBST.insert(49);
//		minBST.insert(87);
//		minBST.insert(51);
//		minBST.insert(52);
		
		minBST.insert(1);
		minBST.insert(0);
		minBST.insert(48);
		minBST.insert(null);
		minBST.insert(null);
		minBST.insert(12);
		minBST.insert(49);
		System.out.println(minBST.difference(root));
	}

}
