package LinkedList;

public class ReverseLinkedList {
    // https://leetcode.com/problems/reverse-linked-list/
    // Given the head of a singly linked list, reverse the list, and return the reversed list.

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            head.next = null;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public class ListNode {
      private int val;
      private ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
