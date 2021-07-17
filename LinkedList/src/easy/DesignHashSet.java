package easy;

public class DesignHashSet {

	static MyHashSet node;

	static class MyHashSet {
		int val;
		MyHashSet next;

		MyHashSet() {
		}

		MyHashSet(int val) {
			this.val = val;
			this.next = null;
		}

		public void add(int key) {
			MyHashSet set = new MyHashSet(key);
			set.next = null;

			if (node == null)
				node = set;
			else {
				MyHashSet tail = node;
				while (tail.next != null) {
					if (!contains(key))
						tail = tail.next;
					else
						break;
				}
				tail.next = set;
			}
		}

		public void remove(int key) {
			MyHashSet removeNode = node;
			MyHashSet previousNode = null;
			if(removeNode != null && removeNode.val == key && previousNode == null) {
				node = removeNode.next;
				return;
			}
			while (removeNode != null && removeNode.val != key) {
				previousNode = removeNode;
				removeNode = removeNode.next;
			}
			if(removeNode != null && removeNode.val == key)
				previousNode.next = removeNode.next;
		}

		public boolean contains(int key) {
			MyHashSet contain = node;
			while (contain != null) {
				if (key == contain.val) {
					return true;
				} else {
					contain = contain.next;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		MyHashSet obj = new MyHashSet();
//		obj.add(1);
//		obj.add(2);
//		obj.contains(1);
//		obj.contains(3);
//		obj.add(2);
//		obj.contains(2);
//		obj.remove(2);
//		obj.contains(2);

		obj.add(9);
		obj.remove(19);
		obj.add(14);
		obj.remove(19);
		obj.remove(9);
		obj.add(0);
		obj.add(3);
		obj.add(4);
		obj.add(0);
		obj.remove(9);
	}

}
