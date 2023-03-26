package com.surcov.revisit.java;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Outer {

    public class Inner {
        public void whoAmI() {
            System.out.println(" I am inner");
            LinkedList<Integer> linkedList = new LinkedList<>();
            HashSet<Integer> integers = new HashSet<Integer>();
            List<Integer> list = new CopyOnWriteArrayList<>();

        }
    }

    public static void fibonacciPrint(int pr, int cr) {
        if (pr > 1000) {
            return;
        }
        int next = pr + cr;
        System.out.print(" " + pr);
        fibonacciPrint(cr, next);
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    static char[] stringRevers(char[] arch) {
        char buf;
        for (int i = 0; i < arch.length - i - 1; i++) {
            buf = arch[i];
            arch[i] = arch[arch.length - i - 1];
            arch[arch.length - i - 1] = buf;
        }
        return arch;
    }

    static String stringRevers(String a) {
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            res = res + a.charAt(i);
        }
        return res;
    }


    static char[] stringReversRecurs(char[] arch, int i) {
        if (i < arch.length - i - 1) {
            char buf = arch[i];
            arch[i] = arch[arch.length - i - 1];
            arch[arch.length - i - 1] = buf;
            stringReversRecurs(arch, ++i);
        }
        return arch;
    }


    public static String reverseRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    class StringReversThread extends Thread {
        @Override
        public void run() {
            System.out.println(stringRevers("123456789"));
        }
    }

    class StringReversRunnable implements Runnable {
        @Override
        synchronized public void run() {
            System.out.println(stringRevers("123456789"));
        }
    }

    private static int doWork(int n){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return n;
    }

    public static void main(String... args) {
        long start = System.currentTimeMillis();
        System.out.println("Cpu cnt "+ Runtime.getRuntime().availableProcessors());
        Stream<String> src= Stream.of("w", "o", "l", "f").parallel();
        String res = src.reduce("", (s1, c) -> s1 + c, (s2, s3) -> s2 + s3);
        System.out.println("result "+res);

        Stream<String> src1= Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> collect = src1.collect(ConcurrentSkipListSet::new,(set,s)->set.add(s), Set::addAll);
        System.out.println(collect);

        Collectors.toSet().characteristics();

        System.out.println("take time="+(System.currentTimeMillis()-start)/1000);
    }
}
