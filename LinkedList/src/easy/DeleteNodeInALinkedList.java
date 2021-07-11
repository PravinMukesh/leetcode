package easy;

public class DeleteNodeInALinkedList {

	static ListNode head;
	static ListNode node;
	static ListNode validate;

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

	public ListNode insertSingleVal(int val) {
		ListNode newNode = new ListNode(val);
		return newNode;
	}

	public ListNode deleteNode(ListNode node) {
		while (head != null) {
			if (node.val == head.val) {
				head = head.next;
			} else {
				ListNode newNode = new ListNode(head.val);
				newNode.next = null;
				if (validate == null)
					validate = newNode;
				else {
					ListNode tail = validate;
					while (tail.next != null) {
						tail = tail.next;
					}
					tail.next = newNode;
				}
				head = head.next;
			}
		}
		return validate;
	}

	/*
	 * Below is the method required to execute in Leetcode where as, the above
	 * method deleteNode() has been written to understand better about the deletion
	 * of node and when the access to the head node was provided.
	 */
//	public void deleteNode(ListNode node) {
//		node.val = node.next.val;
//		node.next = node.next.next;
//	}

	public static void main(String[] args) {
		DeleteNodeInALinkedList cast = new DeleteNodeInALinkedList();
//		cast.insert(4);
//		cast.insert(5);
//		cast.insert(1);
//		cast.insert(9);

//		cast.insert(1);
//		cast.insert(2);
//		cast.insert(3);
//		cast.insert(4);

//		cast.insert(0);
//		cast.insert(1);

		cast.insert(-3);
		cast.insert(5);
		cast.insert(-99);
		DeleteNodeInALinkedList castValue = new DeleteNodeInALinkedList();
//		node = castValue.insertSingleVal(5);
//		node = castValue.insertSingleVal(3);
//		node = castValue.insertSingleVal(0);
		node = castValue.insertSingleVal(5);
		System.out.println(cast.deleteNode(node));
	}

}
