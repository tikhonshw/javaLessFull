package com.itProgerT1W2;

public class main {
//    Создайте двумерный массив, в котором найдите минимальный элемент среди всех элементов в массиве.
//    Важно учесть, что нахождение минимального элемента должно производиться при помощи циклов. Массив:
//    int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };

    public static void main(String[] args) {
        int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
        int min = Integer.MAX_VALUE;
        String adrMin = "[0][0]";
        String povtor = "";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] < min) {
                    min = x[i][j];
                    adrMin = "[" + i + "][" + j + "]";
                    povtor = "";
                } else if (x[i][j] == min) {
                    povtor += "Повторы минимального значения! Адрес в массиве x[" + i + "][" + j + "]\n";
                }
            }
            System.out.println();
        }
        System.out.println("Минимальное значение в массиве: " + min + " его адрес: x" + adrMin );
        if (povtor.length() > 0) System.out.printf(povtor);
    }
}
