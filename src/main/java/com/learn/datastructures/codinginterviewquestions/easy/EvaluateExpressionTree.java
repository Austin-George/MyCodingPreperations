package com.learn.datastructures.codinginterviewquestions.easy;

public class EvaluateExpressionTree {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int solution(BinaryTree tree) {
        return evaluate(tree);
    }

    public static int evaluate(BinaryTree tree) {
        int valuation = 0;
        if(tree.left == null && tree.right == null) {
            valuation = tree.value;
        }
        switch (tree.value) {
            case -1:
                valuation = evaluate(tree.left) + evaluate(tree.right);
                break;
            case -2:
                valuation =  evaluate(tree.left) - evaluate(tree.right);
                break;
            case -3:
                valuation = evaluate(tree.left) / evaluate(tree.right);
                break;
            case -4:
                valuation = evaluate(tree.left) * evaluate(tree.right);
                break;
        }
        return valuation;
    }
}
