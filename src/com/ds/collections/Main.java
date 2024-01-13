package com.ds.collections;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        List ar = new ArrayList();
        ar.add(5);
        ar.add(new Date());
        ar.add("RCA");
        StudentList student= new StudentList(10 ,"Mark");
        ar.add(student);

        Integer first = (Integer) ar.get(0);
        Date today = (Date) ar.get(1);
        String s= (String) ar.get(2);
        Object ob = ar.get(0);
        Object st = ar.get(3);

        System.out.println("Student name and age: "+st);

        System.out.println(first);
        System.out.println("Date: "+today);
        System.out.println("String: "+s);
        System.out.println("Number: "+ob);

        System.out.println("Using foreach");
        for(Object o : ar){
            System.out.println(o);
        }

        List<Object> set = new ArrayList<>();
        set.add(12);
        set.add(12);
        set.add(12);
        set.add(13);
        set.add(15);


        System.out.println(set.size());
        Map<java.io.Serializable, java.io.Serializable> map = new HashMap<java.io.Serializable, java.io.Serializable>();
        map.put("school: ","Rwanda coding academy");
        map.put("district: ","Nyabihu");
        map.put("year: ",2023);
        map.put(2023,"Intake 2023");
        map.get(2023);

        System.out.println("Created list: "+ ar);
    }
}