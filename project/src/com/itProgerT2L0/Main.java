package com.itProgerT2L0;

public class Main  {
    public static void main(String[] args) {
        Car bmw = new Car("m3", 444.00f, "red", true);
        bmw.speed = 230;
//        bmw.setAll("m3", 444.00f, "red", true);
//        bmw.printAll();
//        System.out.println(bmw.speed);

        Car mercedes = new Car("rrr", 23123.00f, "green", false);
        mercedes.speed = 100;
//        mercedes.setAll("rrr", 23123.00f, "green", false);
//        mercedes.printAll();
//        System.out.println(mercedes.speed);

        Car fiat = new Car();

    }
}
