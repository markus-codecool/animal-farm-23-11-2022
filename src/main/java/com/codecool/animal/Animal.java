package com.codecool.animal;

public abstract class Animal {
    private int weight;
    private final int id;
    private final String noise;

    protected Animal(int weight, int id, String noise) {
        this.weight = weight;
        this.id = id;
        this.noise = noise;
    }

    public void makeNoise() {
        System.out.println(noise);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getNoise() {
        return noise;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", id=" + id +
                ", noise='" + noise + '\'' +
                '}';
    }
}
