package com.java.learn;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        int choice;
        System.out.println("1.Print ascending numbers");
        System.out.println("2.Product of all odd numbers less than 20");
        System.out.println("3.Product of prime numbers less than 100");

        System.out.println("\nEnter your choice: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> printAscending();
           // case 2 -> System.out.println("Product of all even numbers less than 20 is: " + productOdd());
           // case 3 -> System.out.println("Product of prime numbers less than 100 is" + calculateProductOfPrimes());

            default -> System.out.println("Invalid choice.");
        }
    }
    public static void printAscending(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        int[] arr = { num1, num2, num3 };

        java.util.Arrays.sort(arr);
        System.out.println("Integers in ascending order: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
