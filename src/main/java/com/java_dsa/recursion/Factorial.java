package com.java_dsa.recursion;

public class Factorial {

    public static void main(String[] args) {

        int factValue=fact(8);
        System.out.println("The factorial is: "+factValue);

    }

    private static int fact(int n){
        // base solution
        if(n==1)
        return 1;
        // recursive solution
        return n*fact(n-1);
    }
    
}
