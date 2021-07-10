package easy;

public class MiddleOfTheLinkedList {

	static ListNode head;
	static ListNode ans;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	private void insert(int val) {
		ListNode newNode = new ListNode(val);
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			ListNode tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
		}
	}

	private ListNode middleNode(ListNode head) {
		if (head == null)
			return head;
		ListNode ans = head;
		while (head != null && head.next != null) {
			ans = ans.next;
			head = head.next.next;
		}
		return ans;
	}

	public static void main(String[] args) {
		MiddleOfTheLinkedList cast = new MiddleOfTheLinkedList();
		cast.insert(1);
		cast.insert(2);
		cast.insert(3);
		cast.insert(4);
		cast.insert(5);
//		cast.insert(6);
		System.out.println(cast.middleNode(head));
	}
}
