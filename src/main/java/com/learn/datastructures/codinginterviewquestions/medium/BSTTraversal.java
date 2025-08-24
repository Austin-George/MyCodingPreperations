package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.ArrayList;
import java.util.List;

public class BSTTraversal {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null) {
            return array;
        }
        array.addAll(inOrderTraverse(tree.left, new ArrayList<>()));
        array.add(tree.value);
        array.addAll(inOrderTraverse(tree.right, new ArrayList<>()));
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null) {
            return array;
        }
        array.add(tree.value);
        array.addAll(preOrderTraverse(tree.left, new ArrayList<>()));
        array.addAll(preOrderTraverse(tree.right, new ArrayList<>()));
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null) {
            return array;
        }
        array.addAll(postOrderTraverse(tree.left, new ArrayList<>()));
        array.addAll(postOrderTraverse(tree.right, new ArrayList<>()));
        array.add(tree.value);
        return array;
    }
}
