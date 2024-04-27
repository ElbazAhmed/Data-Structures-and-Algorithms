package LinkedList;

public class LinkedListCycleII {
    // https://leetcode.com/problems/linked-list-cycle-ii
    // Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
    public ListNode detectCycle(ListNode head) {
        int hasCycle = hasCycle(head);
        if(hasCycle == 0){
            return null;
        }
        int cycleLength = hasCycle(head);
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i=0; i<cycleLength; i++){
            temp1 = temp1.next;
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    //check if the linked list has a cycle and return it's length
    public int hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                int cycleLength = 1;
                ListNode temp = slow.next;
                while(temp != slow){
                    temp = temp.next;
                    cycleLength += 1;
                }
                return cycleLength;
            }
        }
        return 0;
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
