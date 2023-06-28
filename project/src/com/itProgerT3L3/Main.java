package com.itProgerT3L3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void main(String[] args) {
//        Course android = new Course(123, "Android");
//        Course kotlin = new Course(123, "Kotlin");

        List<Course> listOfCourses = new ArrayList<>();
        listOfCourses.add(new Course(1, "Android"));
        listOfCourses.add(new Course(2, "Kotlin"));

        printList(listOfCourses);

        List<Lessons> listOfLessons = new ArrayList<>();
        listOfLessons.add(new Lessons(1, "Android"));
        listOfLessons.add(new Lessons(2, "Kotlin"));

        printList(listOfLessons);

//        System.out.println(android);
//        System.out.println(kotlin);
//        System.out.println(android.equals(kotlin));
//
//        String str1 = "Hello";
//        String str2 = "Hello";
//        System.out.println(str1 == str2);
    }

    public static void printList(List<? extends Course> list) {
        for(Course el: list) {
            System.out.println(el);
        }
    }
}
