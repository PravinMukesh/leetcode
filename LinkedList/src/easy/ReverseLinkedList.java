package easy;

import java.util.Stack;

import easy.DeleteNodeInALinkedList.ListNode;

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
		Stack<Integer> stack = new Stack<>();
		while (head != null) {
			stack.push(head.val);
			head = head.next;
		}
		while(stack.size() > 0) {
			ListNode newNode = new ListNode(stack.pop());
			newNode.next = null;
			if (ans == null)
				ans = newNode;
			else {
				ListNode tail = ans;
				while (tail.next != null) {
					tail = tail.next;
				}
				tail.next = newNode;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		ReverseLinkedList cast = new ReverseLinkedList();
		cast.insert(1);
		cast.insert(2);
		cast.insert(3);
		System.out.println(cast.reverseList(head));
	}

}
