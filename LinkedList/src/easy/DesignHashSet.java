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
					if (!existCheck(key))
						tail = tail.next;
					else
						break;
				}
				tail.next = set;
			}
			System.out.println("null");
		}

		public void remove(int key) {
			MyHashSet removeNode = node;
			MyHashSet previousNode = null;
			if (removeNode != null && removeNode.val == key && previousNode == null) {
				node = removeNode.next;
				System.out.println("null");
				return;
			}
			while (removeNode != null && removeNode.val != key) {
				previousNode = removeNode;
				removeNode = removeNode.next;
			}
			if (removeNode != null && removeNode.val == key)
				previousNode.next = removeNode.next;
			System.out.println("null");
		}

		public boolean contains(int key) {
			MyHashSet contain = node;
			while (contain != null) {
				if (key == contain.val) {
					System.out.println("true");
					return true;
				} else {
					contain = contain.next;
				}
			}
			System.out.println("false");
			return false;
		}

		public boolean existCheck(int key) {
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

//		obj.add(9);
//		obj.remove(19);
//		obj.add(14);
//		obj.remove(19);
//		obj.remove(9);
//		obj.add(0);
//		obj.add(3);
//		obj.add(4);
//		obj.add(0);
//		obj.remove(9);
		
		obj.contains(72);obj.remove(91);obj.add(48);obj.add(41);
		obj.contains(96);obj.remove(87);
		obj.contains(48);
		obj.contains(49);obj.add(84);obj.add(82);obj.add(24);obj.add(7);obj.remove(56);obj.add(87);obj.add(81);obj.add(55);obj.add(19);obj.add(40);obj.add(68);obj.add(23);obj.add(80);obj.add(53);obj.add(76);
		obj.contains(93);obj.add(95);
		obj.contains(95);obj.add(67);obj.add(31);
		obj.contains(80);obj.add(62);obj.add(73);obj.remove(97);obj.add(33);obj.add(28);obj.add(62);obj.add(81);obj.add(57);
		obj.contains(40);obj.add(11);obj.add(89);obj.add(28);obj.remove(97);
		obj.contains(86);obj.add(20);
		obj.contains(5);obj.add(77);obj.add(52);obj.add(57);obj.add(88);obj.add(20);
		obj.contains(48);obj.remove(42);obj.remove(86);obj.add(49);obj.remove(62);
		obj.contains(53);obj.add(43);obj.remove(98);obj.add(32);obj.add(15);obj.add(42);obj.add(50);
		obj.contains(19);
		obj.contains(32);obj.add(67);obj.remove(84);obj.remove(60);obj.remove(8);obj.remove(85);obj.add(43);obj.add(59);
		obj.contains(65);obj.add(40);obj.add(81);obj.remove(55);obj.add(56);obj.add(54);obj.add(59);obj.add(78);obj.add(53);obj.add(0);obj.add(24);obj.add(7);obj.remove(53);obj.add(33);obj.remove(69);obj.remove(86);obj.add(7);obj.remove(1);obj.add(16);obj.remove(58);obj.add(61);obj.add(34);obj.add(53);obj.remove(84);obj.remove(21);obj.remove(58);obj.add(25);
		obj.contains(45);obj.add(3);
	}
}

// Below code is just for the execution on leetcode & understanding purpose for interview

class MyHashSet {

    Node node;
    
    class Node {
        int val;
        Node next;
        
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    /** Initialize your data structure here. */
    public MyHashSet() {
         node = new Node(-1);
    }
    
    public void add(int key) {

			Node curr  = node;
	        if(contains(key)) return;
	        while(curr != null && curr.next != null) {
	            curr = curr.next;
	        }
	        curr.next = new Node(key);
    }
    
    public void remove(int key) {
			Node removeNode = node;
			Node previousNode = null;
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
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
			Node contain = node;
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

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
