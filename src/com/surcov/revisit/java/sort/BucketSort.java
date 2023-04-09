package com.surcov.revisit.java.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void bucketSort(double[] arr) {
        final int BUCKET_CNT = 10;
        List<Double>[] buckets = new ArrayList[BUCKET_CNT];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i]= new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int bucketNr =  (int)Math.floor(arr[i]*BUCKET_CNT);
            buckets[bucketNr].add(arr[i]);
        }

        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        int a = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (Double val: buckets[i]) {
                arr[a++] = val;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Bucket sort in Java");
        double[] input = {.78, .17, .39, .72, .94, .21, .12, .23, .68, .12, .17, .21, .23, .26};
        System.out.println("integer array before sorting");
        System.out.println(Arrays.toString(input));

        bucketSort(input);
        System.out.println("integer array after sorting using bucket sort algorithm");

        System.out.println(Arrays.toString(input));
    }
}


