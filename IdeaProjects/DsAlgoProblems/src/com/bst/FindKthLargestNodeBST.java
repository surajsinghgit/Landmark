package com.bst;

/*https://www.geeksforgeeks.org/kth-largest-element-in-bst-when-modification-to-bst-is-not-allowed/*/
public class FindKthLargestNodeBST {
    public static void main(String[] args) {

    }

    static class Node {
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
}
