package com.surcov.revisit.java.stringTasks;

public class RotationOfString {

      public static boolean stringRotation(String s1,String s2) {
           return (s1+s1).indexOf(s2)>-1;
      }

    public static void main(String ...rrr) {
        System.out.println(stringRotation("IndiaUSAEngland","USAEnglandIndia"));
        System.out.println(stringRotation("IndiaUSAEngland","IndiaEnglandUSA"));
        System.out.println(stringRotation("123456","456123"));
    }

}
