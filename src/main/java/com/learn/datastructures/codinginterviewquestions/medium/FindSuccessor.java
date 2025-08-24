package com.learn.datastructures.codinginterviewquestions.medium;

public class FindSuccessor {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree solution(BinaryTree tree, BinaryTree node) {
        return findTheNode(node);
    }

    public BinaryTree findTheNode(BinaryTree node) {
        BinaryTree resultNode = null;
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            resultNode = node;
        } else {
            int nodevalue = node.value;
            while (node.parent != null) {
                if (node.parent.left != null && node.parent.left.value == nodevalue) {
                    resultNode = node.parent;
                    break;
                } else {
                    nodevalue = node.parent.value;
                }
                node = node.parent;
            }
        }
        return resultNode;
    }
}
