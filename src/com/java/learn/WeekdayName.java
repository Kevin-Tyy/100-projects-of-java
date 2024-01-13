package com.java.learn;

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a weekday number (1-7): ");
        int day = scanner.nextInt();

        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println("Day of the week is: " + dayName);
        scanner.close();
    }
}
