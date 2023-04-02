package com.surcov.revisit.java.stringTasks;

public class AllStringPremutation {


    public static void perm(String perm,String word){
        if (word.length()==0){
            System.out.println(perm);
        }
        for (int i=0;i<word.length();i++){
            perm(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1));
        }
    }

    public static void main(String ...aa){
        perm("","xyz");
    }



}
