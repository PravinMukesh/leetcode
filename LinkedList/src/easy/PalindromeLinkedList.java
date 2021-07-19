package easy;

import java.util.Stack;

public class PalindromeLinkedList {

	static ListNode head;
	static ListNode previousHead;

	class ListNode {
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

	public boolean isPalindrome(ListNode head) {
		ListNode currentNode = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(currentNode != null) {
			stack.push(currentNode.val);
			currentNode = currentNode.next;
		}
		while(head != null) {
			if(head.val != stack.pop()) {
				return false;
			} else
				head = head.next;
		}
			return false;
	}


	public static void main(String[] args) {
		PalindromeLinkedList cast = new PalindromeLinkedList();
		cast.insert(1);
		cast.insert(2);
		cast.insert(1);
//		cast.insert(1);
		System.out.println(cast.isPalindrome(head));
	}

}
