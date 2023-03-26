package com.surcov.revisit.java;

import java.util.Arrays;

public class QuickSort {

    static int partitioning(int[] a, int p, int r){
        int i = p-1;
        int j = p;
        int k = a[r];

        while(j<r){
            if (a[j]<k){
                ++i;
                int buf = a[i];
                a[i] = a[j];
                a[j] = buf;
            }
            ++j;
        }

        int buf =  a[i+1];
        a[i+1] = k;
        a[r] = buf;

        return i+1;
    }

    static void quickSort(int[] a,int p,int r){
        if (p<r){
           int pivot = partitioning(a,p,r);
           quickSort(a,p,pivot-1);
           quickSort(a,pivot+1,r);
        }
    }

    public static void main(String ...arr){
        int[] a = new int[]{1, 8, 20, 0, 4, 5, 6, 2, 8, 10};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }

}
