package easy;

public class ReverseLinkedList {
	static ListNode head;
	static ListNode ans;

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

	public ListNode reverseList(ListNode head) {
		ListNode previous = null;
		while (head != null) {
			ListNode currentNode = head;
			head = head.next;
			currentNode.next = previous;
			previous = currentNode;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList cast = new ReverseLinkedList();
		cast.insert(1);
		cast.insert(2);
		cast.insert(3);
		System.out.println(cast.reverseList(head));
	}

}
