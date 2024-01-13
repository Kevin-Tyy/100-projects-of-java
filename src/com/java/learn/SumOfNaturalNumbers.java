package com.java.learn;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}
