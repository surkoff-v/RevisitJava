package com.surcov.revisit.java;

public class CharOccurence {

    public static void main(String ...ar){
        String a = "asdasfasfaasdfasdfasdf";

        System.out.println(a.chars().mapToObj(c->(char)c).filter(c->c=='a').count());


    }

}
