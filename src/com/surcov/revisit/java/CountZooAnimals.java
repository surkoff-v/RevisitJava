package com.surcov.revisit.java;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountZooAnimals {

        // Function to find missing number
        static int getMissingNo(int a[], int n) {
            int x1 = a[0];
            int x2 = 1;

            // For xor of all the elements in array
            for (int i = 1; i < n; i++)
                x1 = x1 ^ a[i];

            // For xor of all the elements from 1 to n+1
            for (int i = 2; i <= n + 1; i++)
                x2 = x2 ^ i;

            return (x1 ^ x2);
        }


    /**
     * A general method to find missing values from an integer array in Java. * This method will work even if array has more than one missing element.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    static void maxAndMin (int[] a){
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }
            if (a[i]<min){
                min = a[i];
            }
        }

        System.out.println(String.format("Max %s min %s",max,min));
    }

    static int[] removeDublicates(int[] a){
        int[] r = new int[a.length];
        r[0] = a[0];
        int pr = r[0];

        for (int i=1; i<a.length; i++) {
            if (a[i] != pr){
                r[i] = a[i];
            }
            pr = a[i];
        }
        return r;
    }


    public static void printPairsUsingSet(int[] numbers, int n) {
        if (numbers.length < 2) {
            return;
        }
        Set set = new HashSet(numbers.length);
        for (int value : numbers) {
            int target = n - value;
            //if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
        System.out.println("!");
    }

    static void twoPointersSolution(int[] a,int k){
        Arrays.sort(a);
        int first = 0;
        int last = a.length-1;
        while (first<last) {
            int sum = a[first]+a[last];
            if (sum == k){
                System.out.println(String.format("{%s,%s}",a[first],a[last]));
                ++first;
                --last;
            } else if (sum<k) {
                ++first;
            } else if (sum>k) {
                --last;
            }
        }

    }

    // Driver code
    public static void main(String args[]) {
       int[] arr = {0, 14, 0, 4, 7, 8, 3, 5, 7};

        twoPointersSolution(arr,11);

    }

    }