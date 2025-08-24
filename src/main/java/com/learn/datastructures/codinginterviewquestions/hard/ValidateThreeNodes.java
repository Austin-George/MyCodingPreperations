package com.learn.datastructures.codinginterviewquestions.hard;

public class ValidateThreeNodes {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public boolean solution(BST nodeOne, BST nodeTwo, BST nodeThree) {
        boolean result = false;

        if(checkNode(nodeTwo, nodeThree) && checkNode(nodeOne,nodeTwo)) {
            result = true;
        } else if (checkNode(nodeTwo, nodeOne) && checkNode(nodeThree, nodeTwo)) {
            result = true;
        }
        return result;
    }

    public boolean checkNode(BST fromNode, BST toNode) {
        boolean result = false;
        while (fromNode != null) {
            if(fromNode.value == toNode.value) {
                result = true;
                break;
            }
            fromNode = fromNode.value > toNode.value ? fromNode.left : fromNode.right;
        }
        return result;
    }
}
