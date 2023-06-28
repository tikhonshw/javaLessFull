package com.itProgerT3L1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {
    public static void main(String[] args) {

        try {
            URL webSite = new URL("http://google.com");
            ReadableByteChannel rbc = Channels.newChannel(webSite.openStream());
            FileOutputStream file = new FileOutputStream("data.html");
            file.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

        } catch (IOException e) {
            e.printStackTrace();
        }

//        Elements obj_1 = new Elements();
//        obj_1.start();
//
//        Elements obj_2 = new Elements();
//        obj_2.start();
//
//        Elements obj_3 = new Elements();
//        obj_3.start();
//        Thread obj_11 = new Thread(new NewTest());
//        obj_11.start();
//
//        Thread obj_12 = new Thread(new NewTest());
//        obj_12.start();
//
//        Thread obj_13 = new Thread(new NewTest());
//        obj_13.start();

//        Thread obj_21 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    System.out.println("Элемент равен: " + i);
//                }
//            }
//        });
//        obj_21.start();
//
//        Thread obj_22 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    System.out.println("Элемент равен: " + i);
//                }
//            }
//        });
//        obj_22.start();
    }

}
