package com.arrays;
//https://www.geeksforgeeks.org/count-frequencies-elements-array-o1-extra-space-time/
public class Integers1ToNCountFrequencies {
    public static void main(String[] args) {
        int[] a = {1, 1, 5, 5, 5, 8, 8};
        int N = 8;
        int[] frequencies = countFrequencies(a, N);
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("a[i]=" + i + " frequency=" + frequencies[i]);
        }
    }

    private static int[] countFrequencies(int[] a, int N) {
        int[] frequencies = new int[N + 1];
        for (int i = 0; i < a.length; i++) {
            frequencies[a[i]]++;
        }
        return frequencies;
    }
}
