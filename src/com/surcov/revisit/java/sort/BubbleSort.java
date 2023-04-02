package com.surcov.revisit.java.sort;

import static com.surcov.revisit.java.sort.SortUtils.*;

public class BubbleSort {

    static void sort(int[] ar){
        boolean swaped;
        for(int i=0;i<ar.length;i++){
            swaped = false;
            for(int j = ar.length-1;j > i;j--){
                if (ar[j]<ar[j-1]){
                    swap(ar, j,j-1);
                    swaped = true;
                }
            }
            SortUtils.pr(ar);
            if(!swaped){
                break;
            }
        }
    }

    static void sortImpoved(int[] ar){

        boolean swaped= true;
        int last = ar.length-1;

        while(swaped){
            swaped = false;
            for(int j = 0;j < last;j++){
                if (ar[j] > ar[j+1]){
                    swap(ar, j,j+1);
                    swaped = true;
                }
            }

            --last;

            pr(ar);
        }
    }


    public static void main(String ...args){
        int[] arr = getRandomArray(20);
        sortImpoved(arr);
       // pr(arr);
    }

}
