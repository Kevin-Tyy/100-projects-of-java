package com.java.learn;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int num1, num2, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Your numbers have been reversed");
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);

    }
}
