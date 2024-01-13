package com.java.learn;

public class PythagoreanPairs {
    public static void main(String[] args) {
        findAndPrintPythagoreanPairs(100);
    }

    public static void findAndPrintPythagoreanPairs(int limit) {
        int count = 0;

        for (int a = 2; a < limit; a++) {
            for (int b = a; b < limit; b++) {
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c * c == cSquared) {
                    count++;
                    System.out.println("(" + a + ", " + b + ")");
                }
            }
        }

        System.out.println("Number of unique pairs found: " + count);
    }
}
