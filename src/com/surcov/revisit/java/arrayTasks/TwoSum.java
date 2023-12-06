package com.surcov.revisit.java.arrayTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String ...arr){
        int ar[] = {1,3,4,5,2,1,8,9,3,6,1,3,5};

        ArrayList<Integer[]> integers = twoSum(ar, 9);
        integers.stream().forEach(a->System.out.println(Arrays.toString(a)));
    }

    public static ArrayList<Integer[]> twoSum(int[] ar, int sum){
        var sums = new ArrayList<Integer[]>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i ++) {
            int dif = sum - ar[i];
            if (map.containsKey(dif)){
                sums.add(new Integer[]{map.get(dif),i});
            } else {
                map.put(ar[i],i);
            }

        }

        return sums;
    }


}
