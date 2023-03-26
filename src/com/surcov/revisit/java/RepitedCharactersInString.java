package com.surcov.revisit.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepitedCharactersInString {

    public static void main(String ...arr){
        String s = "Programming";

        char[] ar = s.toCharArray();
        Map<Character,Integer> m = new HashMap<>();

        for (char c:ar) {
            if (m.containsKey(c)){
                m.put(c,m.get(c)+1);
            } else {
                m.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : m.entrySet()) {
            if (characterIntegerEntry.getValue()>1){
                System.out.print(characterIntegerEntry.getKey()+" ");

                LinkedHashMap<Integer,Integer> map =  new LinkedHashMap<>();

            }
        }


    }

}
