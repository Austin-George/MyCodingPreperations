package com.learn.algoexpert.codinginterviewquestions.medium;

public class HeightBalancedBinaryTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class Answer {
        public int height;
        public boolean isBalanced;

        public Answer(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public boolean solution(BinaryTree tree) {
        return findBalanced(tree).isBalanced;
    }

    public Answer findBalanced(BinaryTree node) {
        if (node == null) {
            return new Answer(0, true);
        }
        Answer left = findBalanced(node.left);
        Answer right = findBalanced(node.right);
        if (!left.isBalanced || !right.isBalanced) {
            return new Answer(0, false);
        }
        int currentHeightDiff = Math.abs(left.height - right.height);
        boolean isBalanced = false;
        if (currentHeightDiff >=0 && currentHeightDiff <=1) {
            isBalanced = true;
        }
        int currentHeight = Math.max(left.height, right.height) + 1;
        return new Answer(currentHeight, isBalanced);
    }
}
