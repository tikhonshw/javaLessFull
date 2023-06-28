package com.itProgerT3L5;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
//        Runnable runnable1 = () -> System.out.println("hello");
        IMath iMath = new IMath() {
            @Override
            public double summ(double a, double b) {
                return a + b;
            }
        };
        System.out.println(iMath.summ(5, 7));

        IMath iMath1 = (double a, double b) -> a + b;
        System.out.println(iMath1.summ(9, 9));
    }
}