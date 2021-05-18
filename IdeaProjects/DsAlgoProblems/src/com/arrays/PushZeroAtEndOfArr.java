package com.arrays;

public class PushZeroAtEndOfArr {

    public static void main(String[] args) {
        int[] a = {3,0,1,0,7};

        int lower=0;
        for (int i =0; i < a.length; i++) {
            if(a[i]!=0){
                a[lower++]=a[i];
            }
        }
        for (int i = lower; i < a.length; i++) {
            a[lower++]=0;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }

    private static void swap(int[] a, int l, int r) {
        int t = a[l];
        a[l] = a[r];
        a[r] = t;
    }
}
