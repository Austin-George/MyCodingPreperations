package com.learn.datastructures.codinginterviewquestions.medium;

public class RemoveKthNodeFromEnd {
    public static void solution(LinkedList head, int k) {
        int n = 0;
        LinkedList node = head;
        LinkedList kthNode = head;
        LinkedList previousNode = head;
        while (node != null) {
            n++;
            if (n > k) {
                previousNode = kthNode;
                kthNode = kthNode.next;
            }
            node = node.next;
        }
        if (k == 1) {
            previousNode.next = null;
        } else {
            node = kthNode;
            previousNode = kthNode;
            while (node.next != null) {
                node.value = node.next.value;
                previousNode = node;
                node = node.next;
            }
            previousNode.next = null;
        }

    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
