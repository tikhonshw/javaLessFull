package com.itProgerT2W1;

public class Main {

    public static void main(String[] args) {
        // Создаем объекты
        Player bot = new Player(); // Есть конструкор без параметров


        Player alex = new Player(VARIANTS.Scissors, "Alex"); // А есть конструктор с параметрами

        // Получаем результат
        System.out.println(bot.whoWins(bot, alex));
    }
}
