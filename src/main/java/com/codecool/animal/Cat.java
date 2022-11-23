package com.codecool.animal;

public class Cat extends Mammal {
    private static final String CAT_NOISE = "meow";

    public Cat(int weight, int id) {
        super(weight, id, CAT_NOISE);
    }
}
