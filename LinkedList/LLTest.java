package LinkedList;

public class LLTest {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(12);
        list.insert(77,3);
        list.display();
        System.out.println();
        //System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
    }
}
