package com.learn.datastructures.codinginterviewquestions.medium;

public class SymmetricalTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean solution(BinaryTree tree) {
        return checkSymmetry(tree.left, tree.right);
    }

    public boolean checkSymmetry(BinaryTree leftNode, BinaryTree rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        } else if (leftNode == null || rightNode == null) {
            return false;
        }
        boolean leftCheck = checkSymmetry(leftNode.left, rightNode.right);
        boolean rightCheck = checkSymmetry(leftNode.right, rightNode.left);
        return leftNode.value == rightNode.value && leftCheck && rightCheck;
    }
}
