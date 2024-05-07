package LinkedList;

public class RemoveNthNodeFromEndofList {
    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    // Given the head of a linked list, remove the nth node from the end of the list and return its head.

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        temp = head;
        if(n == length){
            head = head.next;
            return head;
        }
        for(int i=1; i<length-n; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

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
