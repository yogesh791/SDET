package com.java_dsa.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int fiboNum=fibo(6);
        System.out.println("Fibonacci num is: "+fiboNum);

    }

    private static int fibo(int n){
        // base solution
        if(n==0 || n==1)
        return n;
        // recursive solution
        return fibo(n-1)+fibo(n-2);
    }
    
}
