package easy;

public class BinaryTreeTilt {

	static TreeNode root;
	static int leftSide;
	static int rightSide;
	static int sum;

	class TreeNode {
		Integer val;
		TreeNode left, right;

		TreeNode(Integer key) {
			this.val = key;
			this.left = right = null;
		}
	}

	public static int findTilt(TreeNode root) {
		if (null == root)
			return 0;
//		if(null != root)
//			sum = root.left.val + root.right.val;
//		if(null == root.left && null == root.right)
//			return 0;
		if (null != root) {
			if(null != root.left && null == root.right)
				sum += root.left.val;
			if(null != root.right && null == root.left)
				sum += root.right.val;
			if (null != root.left && null != root.right) {
				if(null != root.left.left || null != root.left.right) {
					
				}
				if(null != root.right.left || null != root.right.right) {
					
				}
				sum += Math.abs(root.left.val - root.right.val);
			}
		//		return sum = Math.abs(findTilt(root.left) - findTilt(root.right));
			findTilt(root.left);
			findTilt(root.right);
		}
		return sum;
	}

//	public static int findTilt(TreeNode root) {
//		if (null == root)
//			return 0;
//		if (null != root) {
//			if (null != root.left) {
//				sum += root.left.val;
//				findTilt(root.left);
//				if (null != root.right) {
//					sum += root.right.val;
//					findTilt(root.right);
//				}
//			}
//			if(null != root.right) {
//				sum += root.right.val;
//				findTilt(root.right);
//				if(null != root.left) {
//					sum += root.left.val;
//					findTilt(root.left);
//				}
//			}
////			if(null == root.left && null == root.right) {
////				return leftSide + rightSide;
////			}
//		}
//		return sum;
//	}

	public static void main(String[] args) {
		BinaryTreeTilt tilt = new BinaryTreeTilt();

//		root = tilt.new TreeNode(1);
//		root.left = tilt.new TreeNode(2);
////		root.left = null;
//		root.right = tilt.new TreeNode(3);
//		4,2,9,3,5,null,7
		root = tilt.new TreeNode(4);
		root.left = tilt.new TreeNode(2);
		root.right = tilt.new TreeNode(9);
		root.left.left = tilt.new TreeNode(3);
		root.left.right = tilt.new TreeNode(5);
		root.right.left = null;
		root.right.right = tilt.new TreeNode(7);
		// 21,7,14,1,1,2,2,3,3
//		root = tilt.new TreeNode(21);
//		root.left = tilt.new TreeNode(7);
//		root.right = tilt.new TreeNode(14);
//		root.left.left = tilt.new TreeNode(1);
//		root.left.right = tilt.new TreeNode(1);
//		root.right.left = tilt.new TreeNode(2);
//		root.right.right = tilt.new TreeNode(2);
//		root.left.left.left = tilt.new TreeNode(3);
//		root.left.left.right = tilt.new TreeNode(3);

		System.out.println(findTilt(root));
	}

}
