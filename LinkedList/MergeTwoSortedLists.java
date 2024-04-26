package LinkedList;

public class MergeTwoSortedLists {
    // https://leetcode.com/problems/merge-two-sorted-lists/
    // You are given the heads of two sorted linked lists list1 and list2.
    //Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    //Return the head of the merged linked list.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
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
