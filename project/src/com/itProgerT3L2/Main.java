package com.itProgerT3L2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Proccess obj = new Proccess();
//        obj.start();
//
//        System.out.println("Нажмите на любую клавишу");
//        Scanner in = new Scanner(System.in);
//        in.nextLine();
//
//        obj.exit();
        final Car fiat = new Car();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fiat.moveCar();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fiat.stopCar();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
