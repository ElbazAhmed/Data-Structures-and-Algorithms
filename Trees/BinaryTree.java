package Trees;

import java.util.Scanner;

public class BinaryTree {
    private Node root;
    public BinaryTree() {
    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    // insert elements
    public void populate(Scanner scanner){
        System.out.println("insert the value of the root :");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to insert the left node of : " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("insert the value of the left node of : " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert the right node of : " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("insert the value of the right node of : " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }
}
