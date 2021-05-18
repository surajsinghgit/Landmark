package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArr=sc.nextInt();
        int[] searchArr = new int[sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++) {
            searchArr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        int index = Arrays.binarySearch(searchArr, target);
        System.out.println(index);
    }
}
