package easy;

public class ConvertBinaryNumberInALinkedListToInteger {

	static ListNode head;

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
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

	public int getDecimalValue(ListNode head) {
		int size = getSize(head);
		int value = recursiveHead(head, size);
		return value;
	}

	private int getSize(ListNode head) {
		ListNode temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	private int recursiveHead(ListNode head, int size) {
		int ans = 0;
		if (head == null)
			return ans;
		else {
			while (size > 0) {
				ans += head.val * Math.pow(2, size - 1);
				head = head.next;
				size--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
//		ConvertBinaryNumberInALinkedListToInteger cast = new ConvertBinaryNumberInALinkedListToInteger();
//		cast.insert(1);
//		cast.insert(0);
//		cast.insert(1);
		ConvertBinaryNumberInALinkedListToInteger cast1 = new ConvertBinaryNumberInALinkedListToInteger();
		cast1.insert(1);
		cast1.insert(0);
		cast1.insert(0);
		cast1.insert(1);
		cast1.insert(0);
		cast1.insert(0);
		cast1.insert(1);
		cast1.insert(1);
		cast1.insert(1);
		cast1.insert(0);
		cast1.insert(0);
		cast1.insert(0);
		cast1.insert(0);
		cast1.insert(0);
		cast1.insert(0);
//		ConvertBinaryNumberInALinkedListToInteger cast2 = new ConvertBinaryNumberInALinkedListToInteger();
//		cast2.insert(0);
//		cast2.insert(0);
		System.out.println(cast1.getDecimalValue(head));
	}

}
