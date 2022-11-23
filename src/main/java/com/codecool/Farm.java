package com.codecool;

import com.codecool.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimals(Animal... animals) {
        for (Animal animal : animals) {
            addAnimal(animal);
        }
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
