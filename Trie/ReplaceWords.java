package Trie;

import java.util.List;

public class ReplaceWords {
    // https://leetcode.com/problems/replace-words/
    // Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the derivatives in the sentence with the root forming it.
    // If a derivative can be replaced by more than one root, replace it with the root that has the shortest length.
    //Return the sentence after the replacement.
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for(String root : dictionary){
            trie.insert(root);
        }

        String[] words = sentence.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words[i];
            int size = trie.searchRootLength(words[i]);
            if(size > 0){
                words[i] = word.substring(0,size);
            }
        }

        return String.join(" ", words);
    }

    public class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }


        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.isEndOfWord = true;
        }

        public int searchRootLength(String word) {
            TrieNode node = root;
            int size = 0;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    return 0;
                }
                node = node.children[index];
                size++;
                if(node.isEndOfWord) return size;
            }
            return 0;
        }
    }

    class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isEndOfWord = false;
        }
    }
}
