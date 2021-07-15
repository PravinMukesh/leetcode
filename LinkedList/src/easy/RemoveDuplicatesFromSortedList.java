package easy;

public class RemoveDuplicatesFromSortedList {

	static ListNode head;
	static ListNode fresh;

	class ListNode {
		int val;
		ListNode next;

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

//	public ListNode deleteDuplicates(ListNode head) {
//		ListNode tail = head;
//		while (tail != null) {
//			if (tail.next != null && tail.val == tail.next.val)
//				tail.next = tail.next.next;
//			else
//				tail = tail.next;
//		}
//		return head;
//	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode currentNode = head;
		ListNode tailNode;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.val == currentNode.next.val) {
				tailNode = currentNode.next.next;
				if (tailNode == null) {
					currentNode.next = null;
					break;
				}
				currentNode.next = tailNode;
			}
			if (currentNode.val != currentNode.next.val)
				currentNode = currentNode.next;
		}
		return head;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedList cast = new RemoveDuplicatesFromSortedList();
		cast.insert(1);
		cast.insert(1);
		cast.insert(2);
		cast.insert(3);
		cast.insert(3);

//		cast.insert(1);
//		cast.insert(1);
//		cast.insert(2);

//		cast.insert(1);
//		cast.insert(1);
//		cast.insert(1);

		System.out.println(cast.deleteDuplicates(head));
	}

}
