package com.surcov.revisit.java.arrayTasks;

import java.util.Arrays;

public class RemoveDublicatesInplace {

    public static void main(String[] args) {
        int[] a = {1,4,5,4,7,3,9,4,3};

        Arrays.sort(a);

        int j= 0;
        for (int i = 0;i<a.length-1;i++){
            if (a[i]!=a[i+1]){
                a[j] = a[i];
                ++j;
            }
        }
        a[j] = a[a.length-1];

        for (int i = 0; i < j; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
