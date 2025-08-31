package com.learn.datastructures.codinginterviewquestions.veryhard;

public class NodeSwap {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList solution(LinkedList head) {
        LinkedList node = head;
        while (node.next != null) {
            int first = node.value;
            int second = node.next.value;
            node.next.value = first;
            node.value = second;
            System.out.println(node.value + " " + node.next.value);
            node = node.next.next;
            if (node == null || node.next == null) {
                break;
            }
        }
        return head;
    }
}
