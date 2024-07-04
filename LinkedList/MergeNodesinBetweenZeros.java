package LinkedList;

public class MergeNodesinBetweenZeros {
    // https://leetcode.com/problems/merge-nodes-in-between-zeros/
    //You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
    //For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
    //Return the head of the modified linked list.

    public ListNode mergeNodes(ListNode head) {
        ListNode node = head;
        ListNode dummy = head.next;
        while(node.next != null){
            if(dummy.val != 0){
                node.val += dummy.val;
                dummy = dummy.next;
            }else{
                if(dummy.next == null){
                    node.next = null;
                }else{
                    node.next = dummy;
                    node = node.next;
                    dummy = dummy.next;
                }
            }
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
