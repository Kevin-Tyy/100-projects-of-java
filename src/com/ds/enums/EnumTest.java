package com.ds.enums;

public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }
    public void tellUsSth (){
        switch (day) {
            case MONDAY -> System.out.println("Mondays are the worst");
            case TUESDAY -> System.out.println("Fridays are the best");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are the best");
            default -> System.out.println("Mid week days are 50-50");
        }
    }


}
