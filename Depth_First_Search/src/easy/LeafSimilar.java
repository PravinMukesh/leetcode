package easy;

public class LeafSimilar {

	TreeNode root;
	class TreeNode {
		int key;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int key) {
			this.key = key;
		}		
	}
	
	public void insert(int key) {
		root = insertRec(root,key);
	}
	
	public TreeNode insertRec(TreeNode root, int key) {
		if(root == null) {
			root = new TreeNode(key);
			return root;	
		}
			root.left = insertRec(root.left, key);
			root.right = insertRec(root.right, key);
		return root;
	}
	
	public void printElements() {
		print(root);
	}
	
	public void print(TreeNode root) {
		if(root != null)
		print(root.left);
		System.out.println(root.key);
		print(root.right);
	}
	
	
	public static void main(String[] args) {
		LeafSimilar leaf = new LeafSimilar();
		leaf.insert(3);
		leaf.insert(5);
		leaf.insert(1);
		leaf.insert(6);
		leaf.insert(2);
		leaf.insert(9);
		leaf.insert(8);
		leaf.insert(7);
		leaf.insert(4);
		
	//	leaf.printElements();
		
	}
}