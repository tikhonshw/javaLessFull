package com.itProgerT2L1;

public class Car {
    public short speed;
    private String model;
    private float weight;
    private String color;
    private boolean isWork;

    Car() {
        System.out.println("Объект создан");
    }
    Car (String model, float weight, String color, boolean isWork) {
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
//        printAll ();
    }
    void setAll(String model, float weight, String color, boolean isWork) {
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
    }

    void printAll () {
        String isWork = this.isWork ? "работает" : "не работает";
        System.out.println("Автомобиль марки " + this.model + ", имеет скорость "
                            + this.speed + " и вес: " + this.weight + ". Его цвет: " + this.color
                            + " и он " + isWork);
    }

}
