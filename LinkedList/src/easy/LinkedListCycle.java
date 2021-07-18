package easy;

public class LinkedListCycle {

	static ListNode head;

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public void insert(int val) {
		ListNode newNode = new ListNode(val);
		newNode.next = null;
		if (head == null)
			head = newNode;
		else {
			ListNode tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
		}
	}

	public boolean hasCycle(ListNode head) {
		if(head == null)
			return false;
		ListNode walker = head;
		ListNode jumper = head;
		while(walker.next != null && jumper.next != null && jumper.next.next != null) {
			walker = walker.next;
			jumper = jumper.next.next;
			if(walker == jumper)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedListCycle cast = new LinkedListCycle();
//		cast.insert(3);
//		cast.insert(2);
//		cast.insert(0);
//		cast.insert(-4);
//		cast.insert(2);
//		cast.insert(0);
//		[-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5]
		cast.insert(1);
		cast.insert(1);
		cast.insert(1);
		System.out.println(cast.hasCycle(head));
	}
}
