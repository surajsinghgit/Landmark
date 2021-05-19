package com.bst;

public class FindKthLargestInBTree {

    public static void main(String[] args) {
        FindKthLargestInBTree bt = new FindKthLargestInBTree();
        BNode root = new BNode(7);
        //Add nodes to the binary tree
        root.left = new BNode(3);
        root.right = new BNode(9);
        root.left.left = new BNode(1);
        root.left.right = new BNode(4);
        root.right.left = new BNode(8);
        root.right.right = new BNode(10);
        Count c = new Count();
        System.out.println(findKthLargest(root, 3, c).data);
    }

    static BNode findKthLargest(BNode root, int k, Count c) {

        if (root.right != null) {
            BNode largestFromRtTree = findKthLargest(root.right, k, c);
            if (largestFromRtTree != null) {
                return largestFromRtTree;
            }
        }
        if (k == c.count) {
            return root;

        } else if (k > c.count) {
            c.count--;
        }

        if (root.left != null) {
            BNode largestFromLtTree = findKthLargest(root.left, k, c);
            if (largestFromLtTree != null) {
                return largestFromLtTree;
            }
        }
        return null;

    }

    static class Count {
        public int count = 0;
    }

    /*//     7
        3       9
     1   4    8    10    */
}
