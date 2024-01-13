package com.java.learn;

import java.util.Scanner;

public class CubeVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();

        double volume = calculateVolume(sideLength);

        System.out.println("Volume of the cube: " + volume);

        scanner.close();
    }

    public static double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }
}
