package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BranchSum {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> solution(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        findAnswer(root, 0, result);
        return result;
    }
    public static void findAnswer(BinaryTree node, int sum, List<Integer> arrayList) {
        if(node == null) {
            return;
        }
        int newSum = sum + node.value;
        if(node.left == null && node.right == null) {
            arrayList.add(newSum);
            return;
        }
        findAnswer(node.left, newSum, arrayList);
        findAnswer(node.right, newSum, arrayList);
    }
}
