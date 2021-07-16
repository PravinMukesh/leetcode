package easy;

public class IntersectionOfTwoLinkedLists {

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
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode intersectVal = new ListNode(0);
        if(headA.val == headB.val) {
        	
        }
        return intersectVal;
    }
	
	public static void main(String[] args) {
		IntersectionOfTwoLinkedLists cast = new IntersectionOfTwoLinkedLists();
		cast.insert(1);
		cast.insert(9);
		cast.insert(1);
		cast.insert(2);
		cast.insert(4);
		ListNode headA = head;
		head = null;
		IntersectionOfTwoLinkedLists cast1 = new IntersectionOfTwoLinkedLists();
		cast1.insert(3);
		cast1.insert(2);
		cast1.insert(4);
		ListNode headB = head;
		
	}

}
