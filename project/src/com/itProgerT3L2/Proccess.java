package com.itProgerT3L2;

public class Proccess extends Thread {

    private volatile boolean isRun = true;

    public void run() {
        while (isRun) {
            System.out.println("Привет");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void exit() {
        isRun = false;
    }
}
