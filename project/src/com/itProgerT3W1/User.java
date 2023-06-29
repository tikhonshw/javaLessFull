package com.itProgerT3W1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private String name, login,hobby;
    private int age;
    public User() {}
    public User(String name, String login, int age, String hobby) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobby = hobby;
    }


    String lineOutHobby;
    @Override
    public String toString() {
        String[] hobbyArr = hobby.split(",");

        for(Object el : hobbyArr) {
            lineOutHobby += el + "\n";
        }
        System.out.println("Пользователь: " + name + " с логином: " + login + " Его возраст: " + age);
        System.out.println("Все хобби: \n" + lineOutHobby);

//        return name + " - " + login + " " + age + " " + "\n" + lineOutHobby;
        return null;
    }


}
