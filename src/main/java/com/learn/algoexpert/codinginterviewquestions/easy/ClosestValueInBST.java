package com.learn.algoexpert.codinginterviewquestions.easy;

public class ClosestValueInBST {
    public static int solution(BST tree, int target) {
        int closestValueDiff = Integer.MAX_VALUE;
        int value = 0;
        while(tree != null) {
            if(Math.abs(Math.abs(tree.value) - Math.abs(target)) < closestValueDiff) {
                closestValueDiff = Math.abs(Math.abs(tree.value) - Math.abs(target));
                value = tree.value;
            }
            if(tree.value > target) {
                tree = tree.left;
            } else {
                tree = tree.right;
            }
        }
        return value;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
