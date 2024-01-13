package com.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point<Integer, Integer> point1 = new Point<Integer, Integer>(12, 15);
        System.out.println(point1);

        Point<Double, Double> point2 = new Point<Double, Double>(12.31,12.293);
        System.out.println(point2);

       /* Point<String>  point3 = new Point<String>("Hello", "world");
        System.out.println(point3);*/

        ArrayList<Point> points = new ArrayList<Point>();

        points.add(point1);
        points.add(point2);
        points.add(new Point<Float, Float>(3.4F,5.3F));
        points.add(new Point<Long, Long>(3L, 3L));

        point2.doSomething(new ArrayList<Double>(Arrays.asList(12.3, 23.3,4.3, 45.2,54.2)));

    }
}
