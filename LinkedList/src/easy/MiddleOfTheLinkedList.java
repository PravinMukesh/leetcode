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
			while(tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
		}
	}
	
	private void insertNew(int val) {
		ListNode newNode = new ListNode(val);
		newNode.next = null;
		if (ans == null) {
			ans = newNode;
		} else {
			ListNode tail = ans;
			while(tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
		}
	}

	private ListNode middleNode(ListNode head) {
		int counter = 0;
		int size = getSize(head);
		int middleNode = (size)/2;
		while(size > 0) {
			if(counter >= middleNode) {
				insertNew(head.val);
			}
			head = head.next;
			counter++;
			size--;
		}
		return ans;
	}
	
	private int getSize(ListNode head) {
		int count = 1;
		while(head.next != null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		MiddleOfTheLinkedList cast = new MiddleOfTheLinkedList();
		cast.insert(1);
		cast.insert(2);
		cast.insert(3);
		cast.insert(4);
		cast.insert(5);
		cast.insert(6);
		System.out.println(cast.middleNode(head));
	}
}
