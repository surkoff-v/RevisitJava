package com.surcov.revisit.java.bst;

import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public class Node {
        private Node left;
        private Node right;
        private T val;

        public Node(Node left, Node right, T val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        private boolean isLeaf() {
            return this.getLeft() == null ? this.getRight() == null : false;
        }


        public Node getLeft() {
            return left;
        }

        public Node setLeft(Node left) {
            this.left = left;
            return left;
        }

        public Node getRight() {
            return right;
        }

        public Node setRight(Node right) {
            this.right = right;
            return right;
        }

        public T getVal() {
            return val;
        }

        public void setVal(T val) {
            this.val = val;
        }
    }

    public Node insertRecursiveInternal(Node cr, T val) {

        if (cr == null) {
            Node n = new Node(null, null, val);
            if (root == null) {
                root = n;
            }
            return n;
        }
        if (cr.val.compareTo(val) > 0) {
            Node node = insertRecursiveInternal(cr.getLeft(), val);
            if (cr.getLeft() == null) {
                cr.setLeft(node);
            }
        } else {
            Node node = insertRecursiveInternal(cr.getRight(), val);
            if (cr.getRight() == null) {
                cr.setRight(node);
            }
        }
        return cr;
    }

    private void preOrderDepthFirstRecInternal(Node n) {
        if (n == null) {
            return;
        }
        System.out.print(" " + n.getVal());
        preOrderDepthFirstRecInternal(n.getLeft());
        preOrderDepthFirstRecInternal(n.getRight());
    }

    public void preOrderDepthFirstRec() {
        preOrderDepthFirstRecInternal(this.getRoot());
    }

    private void inOrderDepthFirstRecInternal(Node n) {
        if (n == null) {
            return;
        }
        inOrderDepthFirstRecInternal(n.getLeft());
        System.out.print(" " + n.getVal());
        inOrderDepthFirstRecInternal(n.getRight());
    }


    public void inOrderDepthFirstRec() {
        inOrderDepthFirstRecInternal(this.getRoot());
    }

    private void postOrderDepthFirstRecInternal(Node n) {
        if (n == null) {
            return;
        }
        postOrderDepthFirstRecInternal(n.getLeft());
        postOrderDepthFirstRecInternal(n.getRight());
        System.out.print(" " + n.getVal());
    }


    public void postOrderDepthFirstRec() {
        postOrderDepthFirstRecInternal(this.getRoot());
    }


    public void preOrderDepthFirst() {
        Stack<Node> st = new Stack<>();
        Node cr = this.getRoot();
        st.push(cr);
        while (!st.empty()) {
            cr = st.pop();
            System.out.print(" " + cr.getVal());
            if (cr.getRight() != null) {
                st.push(cr.getRight());
            }
            if (cr.getLeft() != null) {
                st.push(cr.getLeft());
            }
        }
    }

    public void inOrderDepthFirst() {
        Stack<Node> st = new Stack<>();
        Node cr = this.getRoot();
        while (cr != null || !st.empty()) {

            while (cr != null) {
                st.push(cr);
                cr = cr.left;
            }
            cr = st.pop();
            System.out.print(" " + cr.getVal());
            cr = cr.getRight();
        }
    }


    public void postOrderDepthFirst() {
        Stack<Node> st = new Stack<>();
        st.push(this.getRoot());
        while (!st.isEmpty()) {
            Node cr = st.peek();

            if (cr.isLeaf()) {
                Node n = st.pop();
                System.out.print(" " + n.getVal());
            } else {
                if (cr.getRight() != null) {
                    st.push(cr.getRight());
                    cr.setRight(null);
                }
                if (cr.getLeft() != null) {
                    st.push(cr.getLeft());
                    cr.setLeft(null);
                }
            }
        }
    }

    public void printAlleavesInternal(Node n){
        if (n==null){
            return;
        }
        if (n.isLeaf()){
            System.out.print(" "+n.getVal());
        } else {
            printAlleavesInternal(n.getLeft());
            printAlleavesInternal(n.getRight());
        }
    }

    public int countAllLeavesRec(Node n){
        if (n==null){
            return 0;
        }
        if (n.isLeaf()) {
            return 1;
        } else {
            return countAllLeavesRec(n.getLeft()) + countAllLeavesRec(n.getRight());
        }
    }

    public int countAllLeaves(Node n) {
        int cnt = 0;
        Stack<Node> st = new Stack<>();
        st.push(n);
        while (!st.empty()) {
            n = st.pop();
            if (n.getRight() != null) {
                st.push(n.getRight());
            }
            if (n.getLeft() != null){
                st.push(n.getLeft());
            }
            if (n.isLeaf()) {
                ++cnt;
            }
        }
        return cnt;
    }

    Node searchRec(Node n,T val){
        if (n==null || n.getVal()==val){
            return n;
        }

        if (n.getVal().compareTo(val)>0){
            return searchRec(n.getLeft(),val);
        }

        return searchRec(n.getRight(), val);

    }

    void insertRecursive(T val) {
        insertRecursiveInternal(this.getRoot(), val);
    }

    public static void main(String... arg) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insertRecursive(5);
        bst.insertRecursive(2);
        bst.insertRecursive(11);
        bst.insertRecursive(4);
        bst.insertRecursive(7);
        bst.insertRecursive(0);
        bst.insertRecursive(6);
        bst.insertRecursive(8);
        bst.insertRecursive(5);

     /*   bst.preOrderDepthFirstRec();
        System.out.println();
        bst.preOrderDepthFirst();
        System.out.println();*/
/*
        bst.inOrderDepthFirstRec();
        System.out.println();
        bst.inOrderDepthFirst();
        System.out.println();
*/
/*
        bst.postOrderDepthFirstRec();
        System.out.println();
        bst.postOrderDepthFirst();
*/
/*
        bst.printAlleavesInternal(bst.getRoot());
        System.out.println();
        System.out.println(bst.countAllLeavesRec(bst.getRoot()));
        System.out.println();
        System.out.println(bst.countAllLeaves(bst.getRoot()));
*/
        BinarySearchTree<Integer>.Node node = bst.searchRec(bst.getRoot(), 11);
        if (node!=null) {
            System.out.println(node.getVal());
        } else {
            System.out.println("node not found");
        }
    }

}
