package com.generics;

import java.util.ArrayList;

public class Point <T extends Number, R extends Number> {
    private T x;
    private R y;

    public Point(T x, R y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public R getY() {
        return y;
    }

    public void setY(R y) {
        this.y = y;
    }

    public void doSomething(ArrayList<T> arr) {
        for (T k: arr){
            System.out.println(k);
        }
    }
    @Override
    public String toString() {
        return "Point {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
