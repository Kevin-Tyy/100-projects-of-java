package com.ds.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> dis = new ArrayList<String>();

        dis.add("Nyabihu");
        dis.add("Rubavu");
        dis.add("Gasabo");
        dis.add(2,"Bugesera");

        List<String> south = Arrays.asList("Huye", "Muhanga");
        dis.addAll(south);

        List<String> north = new ArrayList<String>();
        north.add("Musanze");
        north.add("Rulindo");
        north.add("Rulindo");

        System.out.println("Checking last index of Rulindo");
        //System.out.println(dis.lastIndexOf("Huye");

        dis.addAll(2,north);

        for (int i = 0; i < dis.size(); i++){
            System.out.println(i+ "=" + dis.get(i));
        }
        if (dis.contains("Musanze")){
/*
          System.out.println("Musanze is present");
*/
        }
/*
        System.out.println(dis.containsAll(north));
*/
/*
        String s = "hello";
        String sl = "hello";
        System.out.println(s.hashCode());
        System.out.println(sl.hashCode());*/
        Iterator<String> it = dis.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        List<String> sub = dis.subList(1,3);
        Object[] obs = dis.toArray();
        for (Object k:obs){
            System.out.println(k);
        }

    }
}
