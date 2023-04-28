package com.p1;

public class Main {
    public static void main(String[] args) {
        recursion(1);
    }

    public static void recursion(int n){
        System.out.println("Hello World");
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursion(n+1);
    }


}