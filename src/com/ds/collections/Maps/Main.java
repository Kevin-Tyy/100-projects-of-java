package com.ds.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**
         *Hashmaps help you to store key value pairs in a single collection
         */
        HashMap map = new HashMap();
        map.put("message", "Hello");
        map.put("count", 123);

        String message = (String) map.get("message");
    }
}
