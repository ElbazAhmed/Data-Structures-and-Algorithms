package LinkedList;

public class DeletetheMiddleNodeofaLinkedList {
    // https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
    // You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
    //The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing,
    // where ⌊x⌋ denotes the largest integer less than or equal to x.
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = new ListNode();
        temp.next = slow;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            temp = temp.next;
        }
        slow = temp;
        if(slow.next == null){
            slow = null;
        }else{
            slow.next = slow.next.next;
        }
        return head;
    }

    public class ListNode {
      private int val;
      private ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


}
