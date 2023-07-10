package com.java_dsa.recursion;

public class SumOfDigits {

    static int arr[]={12,22,45,76,15,12,22,45,76,15};
    
    public static void main(String[] args) {
        
    int value=sumOfDigits(arr.length-1);
    System.out.println("The sum of digits in array is: "+value);

    }

    private static int sumOfDigits(int n) {
        //base solution
        if(n==0)
        return arr[0];
        //recursive solution
        return arr[n]+sumOfDigits(n-1);
    }

}
