package LinkedList;

public class FindtheMinimumandMaximumNumberofNodesBetweenCriticalPoints {
    // https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
    // Given a linked list head, return an array of length 2 containing [minDistance, maxDistance]
    // where minDistance is the minimum distance between any two distinct critical points
    // and maxDistance is the maximum distance between any two distinct critical points.
    // If there are fewer than two critical points, return [-1, -1].

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return new int[]{-1, -1};

        ListNode prev = head;
        ListNode current = head.next;
        int firstCritical = -1, lastCritical = -1, minDistance = Integer.MAX_VALUE;
        int index = 1, firstIndex = -1;

        while (current.next != null) {
            int val = current.val;
            if ((prev.val < val && current.next.val < val) || (prev.val > val && current.next.val > val)) {
                if (firstCritical == -1) {
                    firstCritical = index;
                    firstIndex = index;
                } else {
                    minDistance = Math.min(minDistance, index - lastCritical);
                }
                lastCritical = index;
            }
            prev = current;
            current = current.next;
            index++;
        }

        if (firstCritical == lastCritical) return new int[]{-1, -1};

        return new int[]{minDistance, lastCritical - firstCritical};
    }

    public class ListNode {
        private int val;
        private ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
