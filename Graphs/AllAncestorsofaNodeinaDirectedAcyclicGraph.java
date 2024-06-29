package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllAncestorsofaNodeinaDirectedAcyclicGraph {
    // https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph
    // You are given a positive integer n representing the number of nodes of a Directed Acyclic Graph (DAG). The nodes are numbered from 0 to n - 1 (inclusive).
    //You are also given a 2D integer array edges, where edges[i] = [fromi, toi] denotes that there is a unidirectional edge from fromi to toi in the graph.
    //Return a list answer, where answer[i] is the list of ancestors of the ith node, sorted in ascending order.
    //A node u is an ancestor of another node v if u can reach v via a set of edges.

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            res.add(new ArrayList<>());
        }
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
        }
        for(int i = 0; i < n; i++){
            dfs(graph, i, i, res, new boolean[n]);
        }
        for(int i = 0; i < n; i++){
            Collections.sort(res.get(i));
        }

        return res;
    }

    private void dfs(ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> res, boolean[] visit){
        visit[curr] = true;
        for(int dest : graph[curr]){
            if(!visit[dest]){
                res.get(dest).add(parent);
                dfs(graph, parent, dest, res, visit);
            }
        }
    }
}
