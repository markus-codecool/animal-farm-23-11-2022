package com.codecool.animal;

public class Dog extends Mammal {
    private static final String DOG_NOISE = "woof";

    private int dugHoles;
    private final DogType breed;

    public Dog(int weight, int id, DogType breed) {
        super(weight, id, DOG_NOISE);
        this.breed = breed;
        this.dugHoles = 0;
    }

    public void digHole() {
        // TODO implement this
    }
}
