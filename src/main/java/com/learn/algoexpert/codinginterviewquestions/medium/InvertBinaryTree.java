package com.learn.algoexpert.codinginterviewquestions.medium;

public class InvertBinaryTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    public static void solution(BinaryTree tree) {
        invertTree(tree);
    }

    public static void invertTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        BinaryTree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;
        invertTree(tree.left);
        invertTree(tree.right);
    }
}
