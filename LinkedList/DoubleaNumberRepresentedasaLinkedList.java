package LinkedList;

public class DoubleaNumberRepresentedasaLinkedList {
    // https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
    // You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
    //Return the head of the linked list after doubling it.

    public ListNode doubleIt(ListNode head) {
        ListNode head1 = new ListNode();
        head1.next = head;
        ListNode left = head1;
        ListNode right = head;
        while(right != null){
            if(right.val*2 >= 10){
                left.val += 1;
            }
            right.val = (right.val*2)%10;
            left = left.next;
            right = right.next;
        }
        return head1.val > 0 ? head1 : head;
    }
    public class ListNode {
      private int val;
      private ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
