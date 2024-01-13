package com.ds.collections.Stacks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class CStack {
    public static void main(String[] args) {
        Stack<Integer> sti = new Stack<Integer>();
        sti.add(12);
        sti.add(123);
        sti.add(43);
        Iterator<Integer> it = sti.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
