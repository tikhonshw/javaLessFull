package com.itProgerT2W1;
/*
При помощи ООП и классов создайте программу «Rock, Paper, Scissors» или же «Камень, ножницы, бумага».
Ваша задача состоит в том чтобы создать: отдельный класс Player,
перечисление Variants и два объекта на основе класса Player.

От себя немного изменил (дополнил) условия
v.0.0.01 - добавлена возможность участия в процессе выбора варината игроком
* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int varGame = 0;
        System.out.println("**************************************************");
        System.out.println("**              !!!  ПОИГРАЕМ  !!!              **");
        System.out.println("**        ИГРА: Камень, ножницы бумага          **");
        System.out.println("**        Помоги Alex'у победить Bot'а          **");
        System.out.println("**************************************************");
        System.out.println("**                Варианты игры:                **");
        System.out.println("**                1. Камень                     **");
        System.out.println("**                2. Ножницы                    **");
        System.out.println("**                3. Бумага                     **");
        System.out.println("**************************************************");
        System.out.println("**           !!!!  Удачной игры  !!!!           **");
        System.out.println("**************************************************");

        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Выберите варинт игры ( (1) Камень / (2) Ножницы / (3) Бумага): ");
            varGame = in.nextInt();
        } catch(Exception e) {
            System.out.println("Не верно выбран режим работы! Работа будет продолжена в режиме (1) Камень )");
            varGame = 1;
        }

        // Создаем объекты
        Player bot = new Player(); // Есть конструкор без параметров
        Player alex = new Player(VARIANTS.values()[varGame - 1], "Alex"); // А есть конструктор с параметрами
        // Получаем результат
        System.out.println(bot.whoWins(bot, alex));
    }
}
