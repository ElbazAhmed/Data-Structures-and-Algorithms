package LinkedList;

public class RemoveLinkedListElements {
    // https://leetcode.com/problems/remove-linked-list-elements/
    // Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0); //temporary node to handle head removal
        temp.next = head;
        ListNode prev = temp;
        ListNode current = head;
        while(current != null){
            if(current.val == val){
                prev.next = current.next; //remove the current node
            }else{
                prev = current; // Move prev to current node
            }
            current = current.next; // move to the next node
        }
        return temp.next; // return the new head 
    }
    public class ListNode {
        private int val;
        private ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
