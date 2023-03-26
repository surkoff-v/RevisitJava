package com.surcov.revisit.java;

import java.awt.desktop.PreferencesEvent;

public class ReversStringWithRecursion {

    public static String revers(String a){
        if (a.length()==1){
            return a;
        }
        return revers(a.substring(1))+""+a.charAt(0);
    }

    public static void main(String ...arr){
      String s= "123456789";
        System.out.println(revers(s));

    }

}
