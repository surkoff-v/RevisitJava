package com.surcov.revisit.java.stringTasks;

import javax.swing.*;

public class ReversWords {

    public static String revWords(String s){
        s = s.trim();
        int i=s.indexOf(" ");

        if (i<0){
           return s;
        } else {
            return (revWords(s.substring(i))+" "+s.substring(0, i)).trim();
        }
    }

    public static String revWords2(String s){
        String[] split = s.trim().split("\\s");
        StringBuilder sb = new StringBuilder(split.length);
        for (int i=split.length-1;i>=0;i--){
            sb.append(split[i]+" ");
        }
        return sb.toString().trim();
    }


    public static void main(String ...arg){
        String s = "aaa bbb ccc dd";
        System.out.println("'"+revWords(s)+"'");
        System.out.println("'"+revWords2(s)+"'");


    }

}
