package Trie;

public class ImplementTrie {
    // https://leetcode.com/problems/implement-trie-prefix-tree/
    // A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings.
    // There are various applications of this data structure, such as autocomplete and spellchecker.
    //Implement the Trie class:
    //    Trie() Initializes the trie object.
    //    void insert(String word) Inserts the string word into the trie.
    //    boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
    //    boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.

    class Trie {
        private static class Node {
            private Node[] children;
            private boolean isWord;

            public Node() {
                this.children = new Node[26];
                this.isWord = false;
            }
        }

        private Node root;

        public Trie() {
            this.root = new Node();
        }

        public void insert(String word) {
            Node node = this.root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Node();
                }
                node = node.children[index];
            }
            node.isWord = true;
        }

        public boolean search(String word) {
            Node node = this.root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return node.isWord;
        }

        public boolean startsWith(String prefix) {
            Node node = this.root;
            for (char c : prefix.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return true;
        }
    }
}
