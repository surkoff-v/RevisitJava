package com.surcov.revisit.java.sort;

import java.util.Arrays;
import static com.surcov.revisit.java.sort.SortUtils.*;

public class InsertionSort {


    private static void insertionSort(int[] arr) {

         for (int i = 0;i<arr.length-1;i++){
             int j = i+1;
             int x = arr[j];
             while (j > 0 && x < arr[j-1]) {
                arr[j] = arr[j-1];
                --j;
             }
             arr[j] = x;
         }
    }

    static void pr(int[] ar) {
        System.out.println(Arrays.toString(ar));
    }



    public static void main(String... args) {
        int[] arr = getRandomArray(20);

        insertionSort(arr);
        pr(arr);
    }
}
