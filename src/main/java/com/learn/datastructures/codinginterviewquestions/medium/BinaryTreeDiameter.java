package com.learn.datastructures.codinginterviewquestions.medium;

public class BinaryTreeDiameter {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    
    static class DiameterAndLength {
        public int diameter;
        public int longestPath;
        public DiameterAndLength(int diameter, int longestPath) {
            this.diameter = diameter;
            this.longestPath = longestPath;
        }
    }

    public static int solution(BinaryTree tree) {
        DiameterAndLength result = findDiameter(tree);
        return result.diameter;
    }
    
    public static DiameterAndLength findDiameter(BinaryTree node) {
        if (node == null) {
            return new DiameterAndLength(0,0);
        }
        DiameterAndLength left = findDiameter(node.left);
        DiameterAndLength right = findDiameter(node.right);
        int currentDiameter = left.longestPath + right.longestPath;
        int currentMaxDiameter = Math.max(left.diameter, right.diameter);
        int currentPathLength = Math.max(left.longestPath, right.longestPath);
        int newMaxDiameter = Math.max(currentMaxDiameter, currentDiameter);
        return new DiameterAndLength(newMaxDiameter, currentPathLength + 1);
    }
}
