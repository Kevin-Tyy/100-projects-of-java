package com.java.learn;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // You can use a switch-case statement to call different methods.
        int choice;
        System.out.println("1.Sum of all even numbers less than 100");
        System.out.println("2.Product of all odd numbers less than 20");
        System.out.println("3.Product of prime numbers less than 100");

        System.out.println("\nEnter your choice: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Sum of all even numbers less than 100 is: " + addEven());
            case 2 -> System.out.println("Product of all even numbers less than 20 is: " + productOdd());
            case 3 -> System.out.println("Product of prime numbers less than 100 is" + calculateProductOfPrimes());

            default -> System.out.println("Invalid choice.");
        }
    }

    public static int addEven() {
        int sum = 0;

        // Loop through numbers from 0 to 99
        for (int i = 0; i < 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add the even number to the sum
            }
        }

        return sum;
    }

    public static int productOdd() {
        int product = 1;

        // Loop through numbers from 1 to 19 (odd numbers)
        for (int i = 1; i <= 19; i += 2) {
            product *= i; // Multiply the odd number to the product
        }

        return product;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long calculateProductOfPrimes() {
        long product = 1;
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                product *= i;
            }
        }
        return product;
    }
}
