package com.learn.datastructures.codinginterviewquestions.hard;

public class DijkstrasAlgorithm {
    public int[] dijkstrasAlgorithm(int start, int[][][] edges) {
        int numberOfVertices = edges.length;
        int[] visited = new int[numberOfVertices];
        int[] distances = new int[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        distances[start] = 0;

        for (int i = 0; i < numberOfVertices; i++) {
            int minNodeWeight = Integer.MAX_VALUE;
            int node = -1;
            for (int j = 0; j < numberOfVertices; j++) {
                if (visited[j] == 0 && distances[j] < minNodeWeight) {
                    minNodeWeight = distances[j];
                    node = j;
                }
            }

            if (node == -1) {
                break;
            }

            visited[node] = 1;

            for (int[] edge:edges[node]) {
                int nextNode = edge[0];
                int nextNodeWeight = edge[1];
                if (visited[nextNode] == 0 && distances[nextNode] > distances[node] + nextNodeWeight) {
                    distances[nextNode] = distances[node] + nextNodeWeight;
                }
            }
        }

        for (int i = 0; i < numberOfVertices; i++) {
            if (distances[i] == Integer.MAX_VALUE) {
                distances[i] = -1;
            }
        }

        return distances;
    }
}
