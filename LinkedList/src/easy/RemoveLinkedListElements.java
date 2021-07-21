package easy;

public class RemoveLinkedListElements {

	static ListNode head;

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
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

//	public ListNode removeElements(ListNode head, int val) {
//		if (head == null)
//			return null;
//		ListNode next = removeElements(head.next, val);
//		if (head.val == val)
//			return next;
//		head.next = next;
//		return head;
//	}

	// checked-in the below code for better understanding

	public ListNode removeElements(ListNode head, int val) {

		ListNode prevNode = new ListNode(-1, head);
		ListNode currentNode = prevNode;

		while (currentNode != null) {
			while (currentNode.next != null && currentNode.next.val == val) {
				currentNode.next = currentNode.next.next;
			}
			currentNode = currentNode.next;
		}
		return prevNode.next;
	}

	public static void main(String[] args) {
		RemoveLinkedListElements cast = new RemoveLinkedListElements();
		int val = 6;
		cast.insert(1);
		cast.insert(2);
		cast.insert(6);
		cast.insert(3);
		cast.insert(4);
		cast.insert(5);
		cast.insert(6);
		System.out.println(cast.removeElements(head, val));
	}

}
