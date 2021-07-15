package easy;

public class MergeTwoSortedLists {

	static ListNode head;

	static class ListNode {
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

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode current = result;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		if (l1 != null)
			current.next = l1;
		else if (l2 != null)
			current.next = l2;
		return result.next;
	}

	public static void main(String[] args) {
		MergeTwoSortedLists cast = new MergeTwoSortedLists();
		cast.insert(1);
		cast.insert(2);
		cast.insert(4);
		ListNode l1 = head;
		head = null;
		MergeTwoSortedLists cast1 = new MergeTwoSortedLists();
		cast1.insert(1);
		cast1.insert(3);
		cast1.insert(4);
		ListNode l2 = head;
		System.out.println(mergeTwoLists(l1, l2));
	}

}
