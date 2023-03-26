package com.surcov.revisit.java;

import java.util.regex.Pattern;

public class OnlyDigits {

    public static void main(String ...ar){
        Pattern pattern = Pattern.compile(".*[^0-9].*");

        String a= "1111ddd2222";
        String b="111111231241255325";

        System.out.println(!pattern.matcher(a).matches());
        System.out.println(!pattern.matcher(b).matches());

    }

}
