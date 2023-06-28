package com.itProgerT2L5;

@MyAnatation
public class Child extends Base {
    @Override
    public void print(String info) {
        System.out.println("Результат: " + info);
    }
}
