package com.company;

public class Summer {

    public Summer(){}

    // Sums all numbers up to n
    public int sum(int[] array) {
        int total = 0;
        for (int elem : array) {
            total += elem;
        }
        return total;
    }

    public int sumEvens(int[] array) {
        int total = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                total += elem;
            }
        }
        return total;
    }

    public int sumOdds(int[] array) {
        int total = 0;
        for (int elem : array) {
            if (elem % 2 != 0) {
                total += elem;
            }
        }
        return total;
    }
}
