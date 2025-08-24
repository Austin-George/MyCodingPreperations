package com.learn.datastructures.codinginterviewquestions.easy;

public class NodeDepths {
    public static int solution(BinaryTree root) {
        int depthSum = findAnswer(0, root);
        return depthSum;
    }

    public static int findAnswer(int currentDepth, BinaryTree root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return currentDepth;
        }
        int sumOfLeft = findAnswer(currentDepth + 1, root.left);
        int sumOfRight = findAnswer(currentDepth + 1, root.right);
        return sumOfRight + sumOfLeft + currentDepth;
    }

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
}
