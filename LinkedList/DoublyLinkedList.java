package LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertFirst(1);
        DLL.insertFirst(2);
        DLL.insertLast(7);
        DLL.insert(2,8);
        DLL.insert(7,9);
        DLL.display();
    }
    Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val,head,null);
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int val){
        if(head == null){
            Node newNode = new Node(val,null,null);
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next!= null){
            last = last.next;
        }
        Node newNode = new Node(val,null,last);
        last.next = newNode;
    }

    public void insert(int after, int val){
        Node temp = head;
        while(temp.val != after){
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next,temp);
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node() {
        }
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
