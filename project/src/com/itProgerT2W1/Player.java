package com.itProgerT2W1;
import java.util.Random;

public class Player {
    private String name = "Bot";
    private VARIANTS choice;
    public Player(VARIANTS choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    public Player() {
        // Строка ниже делает случайный выбор из перечисления
        // к сожалению в предложеных лекциях данной функции не описано!!
        // но Интернет большая "помойка" надется все
        // для начала хотел через массив, но путь немного длинный нежеле та функция которая используется ниже
        // а на самом деле очень не хватает больше разборов именно ООП!!!!!! (это чисто мое мнение!!!
        // ну не дается оно мне вот так вот просто.. похоже все также сказывается долгое время за PHP.
        // вроде все понимаешь как написать что написать в коде а как это написать....
        VARIANTS botVariant = VARIANTS.values()[new Random().nextInt(VARIANTS.values().length)];
        this.choice = botVariant;
    }

    public String whoWins(Player firstPlayer, Player secondPlayer) {
//        Paper, Rock, Scissors
        String firstPl = String.valueOf(firstPlayer.choice);
        String secondPl = String.valueOf(secondPlayer.choice);
        String outStr = "";

        if (firstPl == secondPl) {
            outStr = "!!!! Ничья !!!! " + firstPlayer.name + " и " + secondPlayer.name + " Красавцы";
        }
        if (firstPl == "Rock" && secondPl == "Scissors") {
            outStr = "У игрока " + firstPlayer.name + ": " + firstPl + "\nУ игрока " + secondPlayer.name + ": " + secondPl + "\n\nПобедитель " + firstPlayer.name;
        }
        if (firstPl == "Rock" && secondPl == "Paper") {
            outStr = "У игрока " + firstPlayer.name + ": " + firstPl + "\nУ игрока " + secondPlayer.name + ": " + secondPl + "\n\nПобедитель " + secondPlayer.name;
        }
        if (firstPl == "Scissors" && secondPl == "Paper") {
            outStr = "У игрока " + firstPlayer.name + ": " + firstPl + "\nУ игрока " + secondPlayer.name + ": " + secondPl + "\n\nПобедитель " + firstPlayer.name;
        }
        if (firstPl == "Scissors" && secondPl == "Rock") {
            outStr = "У игрока " + firstPlayer.name + ": " + firstPl + "\nУ игрока " + secondPlayer.name + ": " + secondPl + "\n\nПобедитель " + secondPlayer.name;
        }
        if (firstPl == "Paper" && secondPl == "Rock") {
            outStr = "У игрока " + firstPlayer.name + ": " + firstPl + "\nУ игрока " + secondPlayer.name + ": " + secondPl + "\n\nПобедитель " + firstPlayer.name;
        }
        if (firstPl == "Paper" && secondPl == "Scissors") {
            outStr = "У игрока " + firstPlayer.name + ": " + firstPl + "\nУ игрока " + secondPlayer.name + ": " + secondPl + "\n\nПобедитель " + secondPlayer.name;
        }
        return outStr;

    }
}
