package LinkedList;

public class SortList {
    // https://leetcode.com/problems/sort-list/
    // Given the head of a linked list, return the list after sorting it in ascending order.
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(head2);

        return mergeTwoLists(left, right);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = new ListNode(temp1.val);
                temp1 = temp1.next;
                temp = temp.next;
                if(temp1 == null){
                    temp.next = temp2;
                    return head.next;
                }
            }else if(temp1.val > temp2.val){
                temp.next = new ListNode(temp2.val);
                temp2 = temp2.next;
                temp = temp.next;
                if(temp2 == null){
                    temp.next = temp1;
                    return head.next;
                }
            }
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
