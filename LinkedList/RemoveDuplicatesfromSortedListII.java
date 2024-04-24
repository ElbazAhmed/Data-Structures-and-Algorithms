package LinkedList;

public class RemoveDuplicatesfromSortedListII {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
    // Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = new ListNode();
        ListNode current = head;
        prev.next = current;
        head = prev;
        while(current != null){
            if(current.next != null && current.val == current.next.val){
                int val = current.val;
                while(current.val == val){
                    current = current.next;
                    if(current == null){
                        break;
                    }
                }
                prev.next = current;
                continue;
            }else{
                prev = current;
            }
            current = current.next;
        }
        return head.next;
    }

    public class ListNode {
      private int val;
      private ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
