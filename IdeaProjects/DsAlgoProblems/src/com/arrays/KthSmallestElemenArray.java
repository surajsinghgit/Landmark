package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
//2 6 3 8 5 9 12 1

//K=4   4
/*https://www.techiedelight.com/find-kth-smallest-element-array/*/
//O(NLogK)
public class KthSmallestElemenArray {
    public static int findKthSmallest(List<Integer> iArr, int k) {
        if(iArr.size()<k){
            throw new IllegalArgumentException("iArr is less than k ");
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
                maxHeap.add(iArr.get(i));
        }
        for (int i = k; i < iArr.size(); i++) {
            if(maxHeap.size()>1 && iArr.get(i)<maxHeap.peek()){
                maxHeap.remove();
                maxHeap.add(iArr.get(i));
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 6;
        System.out.println("k'th smallest array element is " + findKthSmallest(A, k));
    }
}
