package com.arrays;

public class ZeroOneTwoInArraySorting {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 2, 1, 0, 1, 0};
        //0, 1, 2, 2, 1, 0, 1, 0
        //0, 1, 0, 2, 1, 0, 1,2
        //0, 1, 0, 1, 1, 0, 2,2
        //0, 0, 0, 2, 1, 1, 2,2
        int lo = 0;
        int hi = a.length - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    swap(a, lo, mid);
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    swap(a, hi, mid);
                    hi--;
                    break;
                }
            }
        }
        System.out.println(a);
    }

    private static void swap(int[] a, int leftIndex, int rightIndex) {
        int temp = a[leftIndex];
        a[leftIndex] = a[rightIndex];
        a[rightIndex] = temp;
    }
}
