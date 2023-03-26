package com.surcov.revisit.java;

import java.util.Arrays;

public class FindAllMissing {

    public static void main(String ...arr){
        int a[] = {2,4,1,5,5,6,8,8,1,10,12};
        int min = a[0];
        int max = a[0];

        for (int i = 0; i< a.length; i++){
            if (a[i]<min){
                min = a[i];
            }
            if (a[i]>max){
                max = a[i];
            }
        }

        int b[] = new int[max-min+2];

        for (int i=0;i<=a.length-1;i++){
            b[a[i]]=1;
        }

        for (int i=min;i<=max;i++){
            if (b[i]!=1) {
                System.out.print(i+" ");
            }
        }

    }
}
