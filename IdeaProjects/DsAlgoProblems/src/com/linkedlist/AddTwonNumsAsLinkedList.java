package com.linkedlist;

import com.common.Node;

/*
https://www.geeksforgeeks.org/add-two-numbers-represented-by-linked-lists/
        Input:
        List1: 5->6->3 // represents number 365
        List2: 8->4->2 // represents number 248
        Output:
        Resultant list: 3->1->6  represents number 613 */
public class AddTwonNumsAsLinkedList {

    public static void main(String[] args) {
        int num1 = 365;
        int num2 = 248;
        Node head1 = convertToLL(num1);
        Node head2 = convertToLL(num2);
        Node sum = addWithLinkedList(head1, head2);
        System.out.println("sum=" + sum.toString());
    }

    private static Node addWithLinkedList(Node first, Node second) {
        // res is head node of the resultant list
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        // while both lists exist
        while (first != null || second != null) {

            sum = carry + (first != null ? first.getData() : 0)
                    + (second != null ? second.getData() : 0);

            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            temp = new Node(sum);

            if (res == null) {
                res = temp;
            } else {
                prev.setNext(temp);
            }

            prev = temp;

            if (first != null) {
                first = first.getNext();
            }
            if (second != null) {
                second = second.getNext();
            }
        }

        if (carry > 0) {
            temp.setNext(new Node(carry));
        }
        return res;
    }

    private static Node convertToLL(int num) {
        Node current = null;
        Node head = null;
        boolean headFound = false;
        while (num != 0) {
            Node newNode = new Node(num % 10);
            if (null != current) {
                current.setNext(newNode);
            }
            if (current != null && !headFound) {
                head = current;
                headFound = true;
            }
            current = newNode;
            num = num / 10;
        }
        return head;
    }
}
