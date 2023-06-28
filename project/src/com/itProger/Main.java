package com.itProger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Напишите программу на Java, что будет высчитывать сумму чисел кратных 3 или 5.
//        Числа должны быть от 0 до 1000.
        int numTmp = 0;
        int i;
        for (i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) numTmp += i;
        }
        System.out.println("сумму чисел кратных 3 или 5 от 0 до 1000 = " + numTmp);



    }

}
