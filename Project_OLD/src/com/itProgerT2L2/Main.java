package com.itProgerT2L2;

public class     Main  {
    public static void main(String[] args) {
//        Car bmw = new Car("m3", 444.00f, "red", true);
//        bmw.speed = 230;
//        bmw.setAll("m3", 444.00f, "red", true);
//        bmw.printAll();
//        System.out.println(bmw.speed);
//
//        Car mercedes = new Car("rrr", 23123.00f, "green", false);
//        mercedes.speed = 100;
//        mercedes.setAll("rrr", 23123.00f, "green", false);
//        mercedes.printAll();
//        System.out.println(mercedes.speed);

//        Car fiat = new Car();

        BMW m5 = new BMW(true, "M5", 4444.00f, "СИНИЙ", true, (short) 55);
        m5.printAll();
        m5.startEnine();

    }
}
