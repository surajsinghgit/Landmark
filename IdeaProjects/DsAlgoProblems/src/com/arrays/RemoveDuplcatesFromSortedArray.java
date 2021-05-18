package com.arrays;

import java.util.Arrays;
import java.util.List;

//https://www.callicoder.com/remove-duplicates-from-sorted-array/
/*Given a sorted array, remove the duplicates from the array in-place such that each element appears only once, and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.*/
public class RemoveDuplcatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 3, 5, 5, 7};
        // Print updated array
        System.out.print(removeDuplicates(a));

    }

    static int removeDuplicates(int a[]) {
        int uniqueElmCouterIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[++uniqueElmCouterIndex] = a[i];
            }
        }
        return uniqueElmCouterIndex+1;
    }
}
