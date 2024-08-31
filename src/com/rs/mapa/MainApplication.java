package com.rs.mapa;

import java.util.HashMap;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("name", "roman");
        stringMap.put("lastName", "sorokin");
        stringMap.put("email", "roman@mail.com");

        System.out.println(stringMap);
        System.out.println(stringMap.get("name"));

        Map<Integer, Integer> intMap = new HashMap<>();
        intMap.put(2, 3);
        intMap.put(4, 5);
        intMap.put(5, 6);

        System.out.println(intMap.replace(2, 10));
        System.out.println(intMap);

        for(Map.Entry<String, String> entry: stringMap.entrySet()){
            System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
        }



    }
}
