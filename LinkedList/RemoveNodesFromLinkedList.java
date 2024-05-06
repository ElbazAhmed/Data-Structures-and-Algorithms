package LinkedList;

public class RemoveNodesFromLinkedList {
    // https://leetcode.com/problems/remove-nodes-from-linked-list
    // You are given the head of a linked list.
    //Remove every node which has a node with a greater value anywhere to the right side of it.
    //Return the head of the modified linked list.

    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = removeNodes(head.next);
        if(temp.val > head.val){
            return temp;
        }
        head.next = temp;
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
