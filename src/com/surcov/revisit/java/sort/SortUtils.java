package com.surcov.revisit.java.sort;

import java.util.Arrays;

public class SortUtils {

    public static int[] getRandomArray(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = (int) (Math.random()*100);
        }
        return arr;
    }

     static void swap(int[] ar, int from, int to) {
        int tmp = ar[to];
        ar[to] = ar[from];
        ar[from]= tmp;
    }

    static void pr(int[] ar,int n,int r) {
        for(int j = n;j<=r;j++) {
            System.out.print(" "+ar[j]);
        }
        System.out.println();
    }

    static void pr(int[] ar){
        System.out.println(Arrays.toString(ar));
    }

    static int patrition(int[] ar, int n, int r) {
        int i = n - 1;
        int j = n;
        int x = ar[r];

        while (j < r) {
            if (ar[j] < x) {
                swap(ar, i + 1, j);
                ++i;
            }
            ++j;
        }

        swap(ar, i + 1, r);
        return i + 1;
    }
}
