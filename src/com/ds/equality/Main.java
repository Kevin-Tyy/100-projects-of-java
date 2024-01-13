/**
 * com.ds.equality
 */
package com.ds.equality;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("john@gmail.com", "John", "Doe", 123);
        Student b = new Student("john@gmail.com", "John", "Doe", 123);
        Student c = a;
        Student d = new Student("claude@gmail.com", "Athony", "Claude", 134);
        Student e = new Student("Manzi@gmail.com", "Manzi", "Ben", 158);
        Student f = new Student("James@gmail.com", "James", "Guy", 290);
        Student g = new Student("claudeA@gmail.com", "Anthony", "Claude", 134);
        Set<Student> students = new TreeSet<>(Arrays.asList(a, b, d, e, f, g));
        //Collections.sort(students);
        for (Student s : students){
            System.out.println(s);
        }


        //stacks
        Stack<Integer> st = new Stack<Integer>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);

        for (Integer i: st){
            System.out.println(i);
        }
        System.out.println(st.peek());
        System.out.println(st.pop());


        //queues
    /*    Queue<Integer> que = new LinkedList<>();
        que.*/


        /*HashSet<String> districts = new HashSet<String>();
        districts.add("Gasabo");
        districts.add("Gasabo");
        districts.add("Bugesera");
        districts.add("Kicukiro");
        districts.add("Rubavu");
        districts.add("Kicukiro");

        System.out.println(districts.size());
        districts.forEach(dis -> {
            System.out.println(dis);
        });*/


        if (a==b){
            System.out.println("a and b reference the same object in memory");
        }else{
            System.out.println("a and b are different");
        }

        if (a==c){
            System.out.println("a and c reference the same object");
        }
        else {
            System.out.println("a and c are different");
        }
        if (a.equals(b)){
            System.out.println("a and b have the same content");
        }
        else {
            System.out.println("a and b do not have the same content");
        }
    }
}
