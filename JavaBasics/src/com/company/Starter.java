package com.company;

import java.util.Arrays;

public class Starter {

    public Starter(){};

    public void start() {

        Summer summer = new Summer();
        Swapper swapper = new Swapper();
        Fibonacci fib = new Fibonacci();

        int[] testArr = {4, 6, 5, 7, 8, 9, 12, 1, 3};
        int[] swapArr = {1, 10};

        System.out.printf("Swapper input: (%d, %d)%n", swapArr[0], swapArr[1]);
        System.out.printf("Swapper output: (%d, %d)%n%n", swapper.swap(swapArr)[0], swapper.swap(swapArr)[1]);

        System.out.println("Input array: ");
        System.out.println(Arrays.toString(testArr));
        System.out.printf("Sum of array: %d%nSum of evens: %d%nSum of odds: %d%n%n",
                summer.sum(testArr), summer.sumEvens(testArr), summer.sumOdds(testArr));

        System.out.printf("The 12th number in the fibonacci sequence is: %d%n%n", fib.calcFibNo(12));

        switch(10) {
            case 1:
                System.out.println("This is case 1!");
                break;
            case 2:
                System.out.println("This is case 2!");
                break;
            case 3:
                System.out.println("This is case 3!");
                break;
            case 4:
                System.out.println("This is case 4!");
                break;
            default:
                System.out.println("This is the default case!");
        }
    }
}
