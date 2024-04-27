package LinkedList;

public class MiddleoftheLinkedList {
    // https://leetcode.com/problems/middle-of-the-linked-list/
    // Given the head of a singly linked list, return the middle node of the linked list.
    //If there are two middle nodes, return the second middle node.
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        int length = listLength(head);
        ListNode temp = head;
        for(int i=0; i<length/2; i++){
            temp = temp.next;
        }
        return temp;
    }
    public int listLength(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }

    public class ListNode {
      private int val;
      private ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
