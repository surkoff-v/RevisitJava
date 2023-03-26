package com.surcov.revisit.java;

import java.sql.SQLOutput;
import java.util.*;

import static com.surcov.revisit.java.LinkedListC.*;
import static com.surcov.revisit.java.LinkedListC.Node.*;

class LinkedListC {
    public static class Node {

        public static Node of(Integer i){
            return new Node(null,i);
        }

        public Node(Node next, Integer val) {
            this.next = next;
            this.val = val;
        }

        private Node next;

        private int val;
        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

    }

    public boolean checkCircle() {
       Node slow = head;
       Node fast = head;
       while (fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;

           if (fast == slow) {
               return true;
           }
       }
      return false;
    }

    public Node getCircleStatringPoint() {
        Node cr = head;
        Set<Node> s = new HashSet<>();
        while (cr!=null){
            if (!s.add(cr)){
               return cr;
            }
            cr = cr.next;

        }
        return null;
    }


    public Node getHead() {
        return head;
    }

    private Node head = null;

    public LinkedListC add(Integer i) {
        if (head == null) {
            head = new Node(null, i);
        } else {
            head = new Node(head, i);
        }
        return this;
    }

    public LinkedListC add(Node n) {
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
        return this;
    }


    public Integer get(){
        if (head == null){
            return null;
        } else {
            Node n = head;
            head = head.getNext();
            return n.getVal();
        }
    }

    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.getVal()+" ");
            n = n.next;
        }
        System.out.println();
    }

    public void reverce(){
        Node prev = null;
        while(head != null){
            Node next = head.getNext();
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
    }

    public void reverceRecInt(Node prev,Node cr){
        if (cr == null) {
            head = prev;
            return;
        }
            Node next = cr.getNext();
            cr.next = prev;
            reverceRecInt(cr,next);
    };

    public void reverceRec() {
        reverceRecInt(null,head);
    }

    public void removeDublicate() {
        Set<Integer> s = new HashSet<>();
        Node cr = head;
        Node prev = null;
        while (cr!= null) {
            if (!s.add(cr.val)) { // уже есть
                prev.next = cr.next;
            } else {
                prev = cr;
            }
            cr = cr.next;
        }
    }



    public Node reverseRecursively(Node n){
        Node newHead;
        if (n.next == null){
            return n;
        }

        newHead = reverseRecursively(n.next);
        n.next.next = n;
        n.next = null;
        return newHead;
    }


    public void reverseRecursively(){
        head = reverseRecursively(head);
    }

    private int lengthRec(Node n){
        if (n == null){
            return 0;
        }
        return 1+lengthRec(n.next);
    }

    public int fac (int m,int n){
        if (n == 0){
            return m;
        }
        m = m*n;
        return fac(m,n-1);
    }

    public int fib(int n){
        if (n==0) {
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public int fibi(int n){
        if (n==1) {
            return 0;
        }
        if (n==2){
            return 1;
        }
        int c = 0;
        int a = 1;
        int b = 1;
        for (int i=3;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }

    public Node thirdFromTheEnd(){
        Node cr = head;
        Node slow = head;
        int i = 0;
        while(cr!=null){
            cr = cr.next;
            if (i>3){
                slow = slow.next;
            }
            i++;
        }
        return slow;
    }

    public Integer length(){
        return lengthRec(head);
    }
}

public class LinkedListTasks {

    public static int findMiddleCustomLinkedList(LinkedListC l) {
        Node cur = l.getHead();
        Node mid=cur;

        int length = 0;
        while (cur.getNext()!=null){
            if (length%2==0){
                mid = mid.getNext();
            }
            cur = cur.getNext();
            ++length;
        }
//        if (length%2==1){
//            mid=mid.getNext();
//        }
        return mid.getVal();
    }

    public static Integer findMiddleLinkedList(LinkedList<Integer> l) {
        int mid = l.size()/2;
        return l.get(mid-1);
    }

    public static LinkedListC reversLinkedList(LinkedListC l){
        LinkedListC result = new LinkedListC();
        while (l.getHead()!=null){
            result.add(l.get());
        }
        return result;
    }

/*    public static void printll(LinkedListC l){
        while (l.getHead()!=null){
            System.out.print(l.get().intValue()+" ");
        }
    }*/


    public static LinkedListC sumOfTwoUsingStack(LinkedListC l1,LinkedListC l2){
        Stack<Integer> s1 = lsToSt(l1);
        Stack<Integer> s2 = lsToSt(l2);
        Stack<Integer> res = new Stack<>();
        int sum,carry = 0;
        while (!s1.empty() && !s2.empty()){
            int value1 = s1.pop();
            int value2 = s2.pop();
            sum = (value1+value2+carry)%10;
            res.add(sum);
            carry = (value1+value2+carry)/10;
        }

        if (!s1.empty()) {
            while(!s1.empty()){
                int value1 = s1.pop();
                sum = (value1+carry)%10;
                res.add(sum);
                carry = (value1+carry)/10;
            }
        } else {// s2 is nnot empty
            while(!s1.empty()){
                int value2 = s2.pop();
                sum = (value2+carry)%10;
                res.add(sum);
                carry = (value2+carry)/10;
            }
        }

        if (carry>0) {
            res.add(carry);
        }

        return stToLs(res);
    }

    private static Stack<Integer> lsToSt(LinkedListC l) {
        Stack<Integer> s = new Stack<>();
        while (l.getHead() != null) {
            s.add(l.get());
        }
        return s;
    }

    private static LinkedListC stToLs(Stack<Integer> s) {
        LinkedListC ls = new LinkedListC();
        while (!s.empty()){
            ls.add(s.pop());
        }
        return ls;
    }



    public static void main(String... args) {
        LinkedListC l1 = new LinkedListC();
        l1.add(1).add(7).add(1).add(9).add(9);
        //Node of2 = of(2);
        LinkedListC l2 = new LinkedListC();
        l2.add(8).add(9).add(9);

        LinkedListC l3 = sumOfTwoUsingStack(l1,l2);
        l3.print();

      //  l.add(1).add(2).add(3).add(4).add(5).add(6).add(7);

        //Node n = l.getCircleStatringPoint();
        //System.out.println(n==null?null:n.getVal());
        //System.out.println(l.length());

        //System.out.println(l.fib(10));
        //System.out.println(l.fibi(10));

    //    System.out.println(l.thirdFromTheEnd().getVal());



       // l.print();
        //l.reverseRecursively();

        //l.removeDublicate();
        //l.print();

/*
        System.out.println(findMiddleCustomLinkedList(l));
        LinkedList<Integer> ls= new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);

        System.out.println(findMiddleLinkedList(ls));
*/
    }

}
