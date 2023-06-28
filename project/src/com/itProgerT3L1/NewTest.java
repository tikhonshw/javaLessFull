package com.itProgerT3L1;

public class NewTest implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Элемент равен: " + i);
        }
    }
}
