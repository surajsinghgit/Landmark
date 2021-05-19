package com.bst;

public class ConvertTreeToSortedArray {

    public static void main(String[] args) {
        ConvertTreeToSortedArray bt = new ConvertTreeToSortedArray();
        BNode root = new BNode(7);
        //Add nodes to the binary tree
        root.left = new BNode(3);
        root.right = new BNode(9);
        root.left.left = new BNode(1);
        root.left.right = new BNode(4);
        root.right.left = new BNode(8);
        root.right.right = new BNode(10);
        int[] array = new int[10];
        int[] array1 = new int[10];
        int pos = 0;
        fill_array(root, array, 1);
        convertBTtoArray(root,array1,0);
        System.out.println(array.toString());
        System.out.println(array1.toString());


    }

    static int fill_array(BNode root, int[] array, int pos) {
        if (root.left != null) {
            pos = fill_array(root.left, array, pos);
        }
        array[pos++] = root.data;
        if (root.right != null) {
            pos = fill_array(root.right, array, pos);
        }
        return pos; // return the last position filled in by this invocation
    }

    /*//     7
        3       9
     1   4    8    10    */

    public static void convertBTtoArray(BNode root, int[] treeArray, int index) {
        //Check whether tree is empty
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            if (root.left != null)
                convertBTtoArray(root.left, treeArray, index);
            //Adds nodes of binary tree to treeArray
            treeArray[index] = root.data;
            index++;
            if (root.right != null)
                convertBTtoArray(root.right, treeArray, index);
        }
    }
}
