package com.surcov.revisit.java.stringTasks;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class GetFirstNotRepeated {

    public static void firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> notRepeating = new ArrayList<>();

        for (int i = 0;i<word.length();i++){
            char c = word.charAt(i);

            if (repeating.contains(c)){
                continue;
            }

            if (notRepeating.contains(c)) {
                notRepeating.remove((Character) c);
                repeating.add(c);
            }else {
                notRepeating.add(c);
            }
        }

        System.out.println(notRepeating.get(0));


    }

    public static void withLinkedHashMap(String s){
        LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();

        for (Character c:s.toCharArray()){
            m.put(c,m.containsKey(c)? m.get(c)+1:1);
        }

        for (Map.Entry<Character,Integer> e: m.entrySet()){
            if (e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }

    }


    public static void main(String ...ar){
        String s = "rogramming";

        withLinkedHashMap(s);

        firstNonRepeatingChar(s);

    }
}
