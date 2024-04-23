package LinkedList;

public class RemoveDuplicatesfromSortedList {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    // Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        while(current != null){
            if(current.val == prev.val){
                prev.next = current.next; // remove the current node
            }else{
                prev = current; // move prev to the current node
            }
            current = current.next; //move to the next node 
        }
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
