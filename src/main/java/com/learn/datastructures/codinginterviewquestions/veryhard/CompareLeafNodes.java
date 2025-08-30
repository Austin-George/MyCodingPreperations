package com.learn.datastructures.codinginterviewquestions.veryhard;

import java.util.ArrayList;

public class CompareLeafNodes {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean solution(BinaryTree tree1, BinaryTree tree2) {
        boolean result = true;
        ArrayList<Integer> tre1 = getLeafNodes(tree1, new ArrayList<>());
        ArrayList<Integer> tre2 = getLeafNodes(tree2, new ArrayList<>());
        int size1 = tre1.size();
        int size2 = tre2.size();
        if (size1 != size2) {
            result = false;
        } else {
            for (int i = 0; i < size1; i++) {
                if (tre1.get(i) != tre2.get(i)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public ArrayList<Integer> getLeafNodes(BinaryTree tree, ArrayList<Integer> array) {
        if (tree == null) {
            return array;
        }
        if (tree.left == null && tree.right == null) {
            array.add(tree.value);
            return array;
        }
        array.addAll(getLeafNodes(tree.left, new ArrayList<>()));
        array.addAll(getLeafNodes(tree.right, new ArrayList<>()));
        return array;
    }
}
