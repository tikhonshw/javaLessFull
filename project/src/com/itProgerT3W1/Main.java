package com.itProgerT3W1;

import com.itProgerT3L4.Course;

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите логин: ");
        String login = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.print("Введите хобби через запятую: ");
        String hobby_1 = in.nextLine();
        String hobby = in.nextLine();

        User[] user = {
                new User(name, login, age, hobby)
        };

        try {
            FileOutputStream fos = new FileOutputStream("usr.main");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream("usr.main");
            ObjectInputStream ois = new ObjectInputStream(fis);

            user = (User[]) ois.readObject();
            System.out.println(Arrays.toString(user));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}