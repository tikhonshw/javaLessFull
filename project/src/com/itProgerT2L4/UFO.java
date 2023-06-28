package com.itProgerT2L4;

public class UFO implements HumanInterface {
    private  int age;
    private Personality person;

    UFO(int age, Personality person) {
        this.age = age;
        this.person = person;
    }
    @Override
    public void talk() {
        System.out.println("Привет ИНОПЛАНЕТЯНЕН я могу говорить");
        System.out.println("Персона:  " + this.person);
    }

    @Override
    public void walk() {
        System.out.println("Привет ИНОПЛАНЕТЯНЕН я могу ходить");

    }

    @Override
    public int getAge() {
        return this.age;
    }
}
