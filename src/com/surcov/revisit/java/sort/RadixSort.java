package com.surcov.revisit.java.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    public static void radixSort(int[] ar) {
        final int RADIX = 10;
        boolean maxLength = false;
        List<Integer>[] bucketArr = new List[RADIX];
        for (int i = 0; i < RADIX; i++) {
            bucketArr[i] = new ArrayList<>();
        }

        int tmp;
        int position = 1;

        while(!maxLength){
            maxLength = true;
            for (int i = 0; i < ar.length; i++) {
                tmp = ar[i] / position;
                bucketArr[tmp % RADIX].add(ar[i]);
                if (maxLength && tmp>0){
                    maxLength = false;
                }
            }

            int a=0;
            for (int i = 0; i < bucketArr.length; i++) {
                for (Integer j:bucketArr[i]) {
                    ar[a++] = j;
                }
                bucketArr[i].clear();
            }

            position *= RADIX;

        }
    }

    public static void main(String[] args) {
        System.out.println("Radix sort in Java");
        int[] input = {181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12};
        System.out.println("An Integer array before sorting");
        System.out.println(Arrays.toString(input));
        // sorting array using radix Sort Algorithm
        radixSort(input);
        System.out.println("Sorting an int array using radix sort algorithm");
        System.out.println(Arrays.toString(input));
    }
}
