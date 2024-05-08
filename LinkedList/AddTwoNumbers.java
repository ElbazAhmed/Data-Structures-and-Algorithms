package LinkedList;

public class AddTwoNumbers {
    // https://leetcode.com/problems/add-two-numbers/
    // You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
    // Add the two numbers and return the sum as a linked list.
    //You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int rest = 0;
        while(temp1 != null && temp2 != null){
            int s = temp1.val + temp2.val + rest;
            rest = 0;
            if(s < 10){
                temp1.val = s;
            }else{
                temp1.val = s%10;
                rest = (s-s%10)/10;
            }
            if(temp1.next == null && temp2.next != null){
                temp1.next = new ListNode(0);
            }
            if(temp1.next != null && temp2.next == null){
                temp2.next = new ListNode(0);
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(rest > 0){
            ListNode temp = l1;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new ListNode(rest);
        }
        return l1;
    }

    public class ListNode {
      private int val;
      private ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
