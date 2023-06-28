package com.itProgerT1W1;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
//    Напишите программу на Java, что будет высчитывать сумму чисел кратных 3 или 5.
//    Числа должны быть от 0 до 1000.
    public static void main(String[] args) {



        System.out.println("**************************************************");
        System.out.println("** Программа подсчета суммы чисел кратных 3 и 5 **");
        System.out.println("**     Вам предложено ввести свое значение      **");
        System.out.println("**    для ввода своего значения введите: True   **");
        System.out.println("**        для счета до 1000 введите: False      **");
        System.out.println("**************************************************");
        int maxCount = 0;
        boolean ccc;
        int outRes = 0;
        ArrayList<String> arr3 = new ArrayList<>(0);
        ArrayList<String> arr5 = new ArrayList<>(0);

        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Выберете режим подсчета (True / False): ");
            ccc = in.nextBoolean();
        } catch(Exception e) {
            System.out.println("Не верно выбран режим работы! Работа будет продолжена в режиме False");
            ccc = false;
        }

        if (ccc) {
            Scanner inNum = new Scanner(System.in);
            do {
                try{
                    System.out.print("Введите число: ");
                    maxCount = inNum.nextInt();
                } catch(Exception e) {
                    System.out.println("ВНИМАНИЕ!!! Введеное значение не являтся типом Int");
                    System.out.println("Расчет будет произведен с числом поумолчанию !!!");
                    maxCount = 1000;
                }
            } while (maxCount < 0);
        } else {
            maxCount = 1000;
        }

        for (int i = 0; i < maxCount; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) arr3.add(Integer.toString(i));
                if (i % 5 == 0) arr5.add(Integer.toString(i));
                outRes += i;
            }
        }
        System.out.println("Сумма чисел кратная 3 и 5 в диапазоне от 0 до " + maxCount + " (не включая " + maxCount + ") = " + outRes);
        System.out.println("\nМассив чисел кратных трем: ");
        for(String el : arr3)
            System.out.print(el + " ");
        System.out.println("\nМассив чисел кратных пяти: ");
        for(String el : arr5)
            System.out.print(el + " ");
    }
}
