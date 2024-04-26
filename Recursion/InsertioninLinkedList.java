package Recursion;

public class InsertioninLinkedList {
    
    public class LL{
        private Node head;

        public void insertRec(int val, int index){
            head = insertRec(val,index,head);
        }
        private Node insertRec(int val, int index, Node node){
            if(index == 0){
                Node newNode = new Node(val,node);
                return newNode;
            }
            node.next = insertRec(val,index-1,node.next);
            return node;
        }

        public class Node{
            private int val;
            private Node next;

            public Node() {
            }
            public Node(int val) {
                this.val = val;
            }
            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
