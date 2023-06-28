package com.itProgerT3L1;

public class Elements extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Элемент равен: " + i);
        }
    }
}
