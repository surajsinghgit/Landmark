package com.arrays;

import java.util.Arrays;

/*Input : [0 1 2 0 1 2]
        Modify array so that it becomes : [0 0 1 1 2 2]
        Hint1 : You are not suppose to use any extra space
        Hint2 : You need change the same array with single traversal with O(n) time complexity*/
public class SegregationlogicMain {
    public static void Sort012(int[] array, int end) {
        //[0 1 2 0 1 2]
        //[0 1 2 0 1 2]
        //[0 1 1 0 2 2]
        //[0 0 1 1 2 2]

        int start = 0, mid = 0;
        int pivot = 1;

        while (mid <= end) {
            if (array[mid] < pivot) {
                swap(array, start, mid);
                ++start;
                ++mid;
            } else if (array[mid] > pivot) {
                swap(array, mid, end);
                --end;
            } else
                ++mid;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Sort012(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}