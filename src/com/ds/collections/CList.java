package com.ds.collections;

import java.util.ArrayList;
import java.util.List;

public class CList {
    public static void main(String[] args) {
        List ar = new ArrayList();

        String em = "sfljk";
        ar.add(em);
        ar.add(5);
        ar.add("7.5");
        ar.add(6);

        Integer a = (Integer) ar.get(0);
        String hello = (String) ar.get(1);

        System.out.println(a);
        System.out.println(hello);
    }
}
