package com.ds.enums;

import java.util.Scanner;

public class Main {
    public static void printDays() {
        for (Day day : Day.values()){
            System.out.print(day + ", ");

        }
        System.out.println();
    }
    public static boolean isValidDay(String userInput){
        for (Day day : Day.values()){
            if (day.name().equals(userInput)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Day m = Day.MONDAY;
        Day t = Day.THURSDAY;
        Day j = Day.MONDAY;
      /*  System.out.println(m.name());
        System.out.println(m.ordinal());*/

        //equality
       /* System.out.println(m.equals(t)); //false
        System.out.println(m.equals(j)); //true*/

        boolean isValid = false;
            do {
                System.out.println("Enter the day today: ");
                Scanner sc = new Scanner(System.in);
                String input;
                input = sc.nextLine().toUpperCase();

                if (isValidDay(input)) {
                    System.out.println("Day is valid");
                    isValid = true;
                } else {
                    System.out.println("Enter a valid day! man");
                    System.out.println("You can only choose from:");
                    printDays();
                }
            }while (!isValid);
    }

/*
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellUsSth();

        EnumTest secDay = new EnumTest(Day.WEDNESDAY);
        secDay.tellUsSth();

        EnumTest thirdDay = new EnumTest(Day.SUNDAY);
        thirdDay.tellUsSth();

        EnumTest forthDay = new EnumTest(Day.SUNDAY);
        forthDay.tellUsSth();

         EnumTest forthDay = new EnumTest(Day.FRIDAY);
         forthDay.tellUsSth();

        */

}
