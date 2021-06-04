package easy;

public class SymmetricTree {

	static TreeNode root;
	static boolean bool;

	class TreeNode {
		Integer val;
		TreeNode left, right;

		TreeNode(Integer key) {
			this.val = key;
			this.left = right = null;
		}
	}

	public static boolean isSymmetric(TreeNode root) {
		if (null == root)
			return false;
		if (null != root) {
			if (null != root.left && null != root.right && root.left.val == root.right.val)
				isSymmetricLeafCheck(root.left, root.right);
			else
				bool = false;
		}
		return bool;
	}

	public static boolean isSymmetricLeafCheck(TreeNode root1, TreeNode root2) {
		 if(null != root.left && null != root.right && root1.left.val == root2.right.val) {
			 bool = true;
			 isSymmetricLeafCheck(root1, root2);
		 }
		 bool = false;
		 return bool;
	}

	public static void main(String[] args) {
		SymmetricTree st = new SymmetricTree();
		// 1,2,2,3,4,4,3
		root = st.new TreeNode(1);
		root.left = st.new TreeNode(2);
		root.right = st.new TreeNode(2);
		root.left.left = st.new TreeNode(3);
		root.left.right = st.new TreeNode(4);
		root.right.left = st.new TreeNode(4);
		root.right.right = st.new TreeNode(3);

		System.out.println(isSymmetric(root));
	}

}
