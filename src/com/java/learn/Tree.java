package com.java.learn;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the tree: ");
        int length = scanner.nextInt();

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= length - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        scanner.close();
    }
}
