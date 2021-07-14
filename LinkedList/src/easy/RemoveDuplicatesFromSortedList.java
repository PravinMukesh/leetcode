package easy;

import easy.ReverseLinkedList.ListNode;

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

	public ListNode deleteDuplicates(ListNode head) {
		while (head != null) {
			if (head.next != null && head.val == head.next.val) {
				head = head.next;
			} else {
				ListNode newNode = new ListNode(head.val);
				newNode.next = null;
				if (fresh == null)
					fresh = newNode;
				else {
					ListNode tail = fresh;
					while (tail.next != null) {
						tail = tail.next;
					}
					tail.next = newNode;
				}
				head = head.next;
			}
		}
		return fresh;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedList cast = new RemoveDuplicatesFromSortedList();
//		cast.insert(1);
//		cast.insert(1);
//		cast.insert(2);
//		cast.insert(3);
//		cast.insert(3);
		
//		cast.insert(1);
//		cast.insert(1);
//		cast.insert(2);
		
		cast.insert(1);
		cast.insert(1);
		cast.insert(1);
		
		System.out.println(cast.deleteDuplicates(head));
	}

}
