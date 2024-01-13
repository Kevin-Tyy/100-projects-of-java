package code.cat.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(39);
        nums.add(12);
        nums.add(12);

        HashSet<String> set = new HashSet<String>();
        set.add("Kevin");
        set.add("Henry");
        set.add("Kevin");

        Iterator<String> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(set.size());
        set.forEach(System.out::println);

    }

}
