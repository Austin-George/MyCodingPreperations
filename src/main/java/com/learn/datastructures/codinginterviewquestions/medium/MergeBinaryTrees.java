package com.learn.datastructures.codinginterviewquestions.medium;

public class MergeBinaryTrees {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree mergeBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
        return solution(tree1, tree2);
    }

    public BinaryTree solution(BinaryTree tree1, BinaryTree tree2) {
        if (tree1 == null) {
            return  tree2;
        }
        if (tree2 == null) {
            return tree1;
        }
        tree1.value = tree1.value + tree2.value;
        tree1.left = solution(tree1.left, tree2.left);
        tree1.right = solution(tree1.right, tree2.right);
        return tree1;
    }
}
