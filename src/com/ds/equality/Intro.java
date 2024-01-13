package com.ds.equality;

public class Intro {
    public static void main(String[] args) {
       /* Integer a = new Integer(123);
        Integer b = new Integer(123);
        Integer c = a;*/

        String a = new String("Hello");
        String b = new String("Hello");
        String c = a;

        if (a==b){
            System.out.println("a and b are referencing the same object in memory");
        }else{
            System.out.println("a and b are different");
        }

        if (a==c){
            System.out.println("a and c are the same object");
        }
        else {
            System.out.println("a and c are different");
        }
        if (a.equals(b)){
            System.out.println("a and b have the same content");
        }
        else {
            System.out.println("a and b are different");

        }
    }
}
