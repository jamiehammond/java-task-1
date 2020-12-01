package com.company;

public class Fibonacci {

    public Fibonacci(){}

    // Returns the nth number in the fibonacci sequence (each number is the sum of the previous 2)
    public int calcFibNo(int n) {
        if (n <= 1) {
            return n;
        }
        return calcFibNo(n - 1) + calcFibNo(n - 2);
    }
}
