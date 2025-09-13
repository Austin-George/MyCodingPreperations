package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CycleInGraph {
    public boolean solution(int[][] edges) {
        boolean result = false;

        int[] visited = new int[edges.length];
        int[] currentDfs = new int[edges.length];

        for (int i = 0; i < edges.length; i++) {
            if (visited[i] == 0) {
                result = dfs(edges, visited, currentDfs, i);
                if (result) {
                    break;
                }
            }
        }
        return result;
    }

    boolean dfs(int[][] edges, int[] visited, int[] currentDfs, int parent) {
        visited[parent] = 1;
        currentDfs[parent] = 1;

        for (int i:edges[parent]) {
            if (visited[i] == 0) {
                if (dfs(edges, visited, currentDfs, i)) {
                    return true;
                }
            } else if(currentDfs[i] == 1) {
                return true;
            }
        }

        currentDfs[parent] = 0;
        return false;
    }
}
