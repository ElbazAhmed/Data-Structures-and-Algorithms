package LinkedList;

public class LinkedListCycle {
    // https://leetcode.com/problems/linked-list-cycle/
    // Given head, the head of a linked list, determine if the linked list has a cycle in it.
    //There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
    //Return true if there is a cycle in the linked list. Otherwise, return false.

    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head;
        while(temp1 != null && temp1.next != null){
            temp = temp.next;
            temp1 = temp1.next.next;
            if(temp == temp1){
                return true;
            }
        }
        return false;
    }

    public class ListNode {
      private int val;
      private ListNode next;
      public ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
