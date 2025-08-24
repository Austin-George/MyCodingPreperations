package com.learn.datastructures.codinginterviewquestions.medium;

public class KthLargestValueInBST {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    static class Result {
        public int kValue;
        public BST value;

        public Result(int kValue, BST value) {
            this.kValue = kValue;
            value = value;
        }
    }

    public int solution(BST tree, int k) {
        return findKthElement(tree, k).value.value;
    }

    public Result findKthElement(BST tree, int k) {
        if (tree == null) {
            return new Result(k, null);
        }
        Result right = findKthElement(tree.right, k);
        if (right.kValue == 0) {
            return right;
        } else if (right.kValue == 1) {
            return new Result(0, tree);
        }
        Result left = findKthElement(tree.left, right.kValue - 2);
        if (left.kValue == 0) {
            return left;
        }
        return new Result(left.kValue - 1, null);
    }
}
