package com.codecool.animal;

public class Goose extends Animal {
    private static final String GOOSE_NOISE = "honk";
    private int laidEggs;

    public Goose(int weight, int id) {
        super(weight, id, GOOSE_NOISE);
        this.laidEggs = 0;
    }

    public void layEgg() {
        this.laidEggs++;
    }

    public int getLaidEggs() {
        return laidEggs;
    }
}
