package com.codecool.animal;

public class Cow extends Mammal{
    private static final String COW_NOISE = "moo";

    public Cow(int weight, int id) {
        super(weight, id, COW_NOISE);
    }
}
