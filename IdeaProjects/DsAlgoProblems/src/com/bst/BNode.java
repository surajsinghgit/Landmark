package com.bst;

public class BNode {
    public BNode(int data, BNode left,
                 BNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int data;
    public BNode left, right;

    public BNode(int bData) {
        data = bData;
        left = right = null;
    }

    @Override
    public String toString() {
        return "BNode{" +
                "data=" + data +
                '}';
    }
}