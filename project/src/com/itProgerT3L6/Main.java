package com.itProgerT3L6;

import com.itProgerT3L5.IMath;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashMap<String, Integer> hMap = new LinkedHashMap<>();
//        HashMap<String, Integer> hMap = new HashMap<>();
        Map<String, Integer> hMap = new TreeMap<>();
        hMap.put("first", 3);
        hMap.put("hasCar", 4);
        hMap.put("asWife", 1);

//        boolean hasCar = hMap.get("hasCar");
//        System.out.println(hasCar);
        for(Map.Entry<String, Integer> entry : hMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " - " + value);
        }

        Set<String> hSet = new TreeSet<>();
        hSet.add("banana");
        hSet.add("milk");
        hSet.add("potato");
        hSet.add("banana");

        for (String str : hSet) {
            System.out.println(str);
        }
    }
}