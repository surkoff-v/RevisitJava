package com.surcov.revisit.java.sort;

import java.util.Arrays;

public class CountingSort {

    private static int[] countingSort (int[] a,int k) {
        int[] c = new int[k];
        int[] b = new int[a.length];

        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            c[a[i]] = c[a[i]] + 1;
        }

        for (int i = 1; i < c.length; i++) {
            c[i] = c[i-1]+c[i];
        }

        for (int i = 0; i < b.length; i++) {
            b[c[a[i]]-1] = a[i];
            c[a[i]] = c[a[i]]-1;
        }
        return b;
    }

    static void pr(int[] ar) {
        System.out.println(Arrays.toString(ar));
    }


    public static void main(String... args) {
        int[] arr = {2, 5, 3, 0, 2, 3, 0, 3};
        pr(countingSort(arr,6));
    }


}
