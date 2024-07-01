package Trie;

import java.util.List;

public class WordBreak {
    // https://leetcode.com/problems/word-break/
    // Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
    //Note that the same word in the dictionary may be reused multiple times in the segmentation.

    public boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = new Trie();
        int length = s.length();
        for (String str : wordDict) {
            trie.insert(str);
        }

        boolean[] dp = new boolean[length + 1];
        dp[0] = true;

        for (int i = 0; i < length; i++) {
            if (!dp[i]) continue;
            Trie.Node node = trie.root;
            for (int j = i; j < length; j++) {
                int index = s.charAt(j) - 'a';
                if (node.children[index] == null) break;
                node = node.children[index];
                if (node.isEndOfWord) {
                    dp[j + 1] = true;
                }
            }
        }
        return dp[length];
    }

    class Trie {
        private static class Node {
            private Node[] children;
            boolean isEndOfWord;

            public Node() {
                this.children = new Node[26];
                isEndOfWord = false;
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
            node.isEndOfWord = true;
        }

    }
}
