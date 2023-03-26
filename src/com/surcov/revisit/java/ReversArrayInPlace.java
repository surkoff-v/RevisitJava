package com.surcov.revisit.java;

import java.util.Arrays;

public class ReversArrayInPlace {

    public static void reversArr(int[] a){
        for (int i=0;i<Math.floor(a.length/2);i++){
            int buf = a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1] = buf;

        }
    }

    public static void main(String ...arr){
        int a[] = {1,2,3,4,5,6,7,8,9};
        reversArr(a);
        System.out.println(Arrays.toString(a));

    }
}
