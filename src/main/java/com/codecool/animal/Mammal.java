package com.codecool.animal;

public abstract class Mammal extends Animal {
    protected Mammal(int weight, int id, String noise) {
        super(weight, id, noise);
    }

    public void giveBirth(int babyWeight) {
        setWeight(getWeight() - babyWeight);
    }
}
