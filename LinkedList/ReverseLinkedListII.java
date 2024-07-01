package LinkedList;

public class ReverseLinkedListII {
    // https://leetcode.com/problems/reverse-linked-list-ii/
    // Given the head of a singly linked list and two integers left and right where left <= right,
    // reverse the nodes of the list from position left to position right, and return the reversed list.

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = new ListNode();
        ListNode next = head;
        ListNode dummy = head;
        if(left != 1){
            prev = head;
            for(int i=1; i<left-1; i++){
                prev=prev.next;
            }
        }else{
            prev.next = head;
        }
        System.out.println(prev.val);
        for(int i=1; i<right; i++){
            next=next.next;
        }
        System.out.println(next.val);
        if(next.next == null){
            prev.next = reverseList(prev.next);
            return left == 1 ? prev.next : head;
        }
        dummy = next.next;
        next.next = null;
        prev.next = reverseList(prev.next);
        ListNode dummy1 = head;
        while(dummy1.next != null){
            dummy1 = dummy1.next;
        }
        dummy1.next = dummy;
        return left == 1 ? prev.next : head;
    }

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
