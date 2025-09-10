package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            Queue<Node> visitedNodes = new LinkedList<>();
            visitedNodes.add(this);
            while (!visitedNodes.isEmpty()) {
                Node ele = visitedNodes.poll();
                array.add(ele.name);
                visitedNodes.addAll(ele.children);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
