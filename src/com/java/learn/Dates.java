package com.java.learn;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today is: " + currentDate);
        System.out.println("John is ");
    }
    public static double CalculateAge () {
        long seconds = 1_000_000_000L; // John's age in seconds
        double secondsInAYear = 31_536_000.0; // Number of seconds in a year (average)
        return seconds / secondsInAYear;
    }
}
