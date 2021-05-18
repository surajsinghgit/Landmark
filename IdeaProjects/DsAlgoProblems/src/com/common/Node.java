package com.common;

public class Node {
    private  Node next;
    //private Node previous;
    int data ;

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }

    public Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
