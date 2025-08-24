package com.learn.datastructures.codinginterviewquestions.veryhard;

public class AllKindOfNodeDepth {

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    public static int solution(BinaryTree root) {
        return findSum(root, 0);
    }

    public static int findSum(BinaryTree node, int depth) {
        if(node == null) {
            return 0;
        }
        int currentDepthSum = (depth * (depth + 1)) / 2;
        return currentDepthSum + findSum(node.left, depth + 1) + findSum(node.right, depth + 1);
    }
}
