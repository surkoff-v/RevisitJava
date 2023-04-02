package com.surcov.revisit.java.sort;

import static com.surcov.revisit.java.sort.SortUtils.*;

public class MergeSort {

    static void mergeSort(int[] ar,int start,int end){
        int mid = (end+start)/2;
        if (start<end) {
            mergeSort(ar, start, mid);
            mergeSort(ar, mid + 1, end);
        }

        merge(ar, start, end, mid);
    }

    private static void merge(int[] ar, int start, int end, int mid) {
        int[] tmp = new int[end - start +1];
        int i = 0;
        int first = start;
        int last = mid +1;

        while (first<= mid && last<= end){
            tmp[i++] = ar[first] <= ar[last] ? ar[first++] : ar[last++];
        }

        while (first<= mid){
            tmp[i++] = ar[first++];
        }
        while (last<= end){
            tmp[i++] = ar[last++];
        }

        i=0;

        while (start <= end){
            ar[start++] = tmp[i++];
        }
    }

    public static void main(String ...arg){
        int[] randomArray = getRandomArray(20);
        mergeSort(randomArray,0,randomArray.length-1);

        pr(randomArray);

    }

}
