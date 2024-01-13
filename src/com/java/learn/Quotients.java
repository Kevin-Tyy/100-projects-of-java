package com.java.learn;

import java.util.Scanner;

public class Quotients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Call the function to compute quotient and remainder
        computeQuotientAndRemainder(dividend, divisor);

        scanner.close();
    }

    public static void computeQuotientAndRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }
}
