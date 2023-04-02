package com.surcov.revisit.java.sort;

import java.util.Stack;
import static com.surcov.revisit.java.sort.SortUtils.*;

public class QuickSortAlg {

    static class Pair{
        int n;
        int r;

        public Pair(int n, int r) {
            this.n = n;
            this.r = r;
        }
    }

    private static void quickSortIter(int[] ar) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(0, ar.length - 1));
        while (!st.empty()) {
            Pair peek = st.pop();
            int n = peek.n;
            int r = peek.r;

            if ((r - n) <= 1) {
                continue;
            }
            int p = patrition(ar, n, r);
            st.add(new Pair(p + 1, r));
            st.add(new Pair(n, p - 1));
        }
    }

    private static void quickSort(int[] ar, int n, int r) {
        if ((r-n)<=1) {
            return;
        }
        pr(ar,n,r);
        int p = patrition(ar, n, r);
        quickSort(ar, n, p-1);
        quickSort(ar, p+1, r);
    }




    public static void main(String... args) {
        int[] arr =getRandomArray(20);
        //quickSort(arr, 0, arr.length - 1);

        quickSortIter(arr);
        pr(arr);
    }
}
