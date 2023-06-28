package com.itProgerT3L7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> info = new ArrayList<>();
//        info.add("First");
//        info.add("2");
//
//        for(Object el : info) {
//            System.out.println(el);
//        }

        Print<String> print1 = new Print<>();
        print1.setInfo("First");
        System.out.println(print1.getInfo());

        Print<Integer> print2 = new Print<>();
        print2.setInfo(25);
        System.out.println(print2.getInfo());

        int info1 = print1.print(new String[] {"Tom", "Alex", "Bob"}, 500);
        System.out.println(info1);
        String info2 = print2.<Integer, String>print(new Integer[] {4, 6, 7}, "Add info");
        System.out.println(info2);

//        print(new String[] {"Tom", "Alex", "Bob"});
//        print(new Integer[] {4, 6, 7});
    }

//    public static <T> void print(T[] items) {
//        for(T item : items) {
//            System.out.println(item);
//        }
//    }

}