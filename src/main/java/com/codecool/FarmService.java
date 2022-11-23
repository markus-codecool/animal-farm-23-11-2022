package com.codecool;

import com.codecool.animal.Animal;
import com.codecool.animal.Goose;

import java.util.Comparator;
import java.util.Optional;

public class FarmService {
    // The farm owner wants to be able to go through every animal and interact with them to hear their noises.
    public void interactWithEveryAnimal(Farm farm) {
        for (Animal animal : farm.getAnimals()) {
            animal.makeNoise();
        }
    }

    // The owner also wants to find the “Golden Goose”, aka the Goose that laid the most eggs.
    public Goose findGoldenGoose(Farm farm) {
        Goose currentGoldenGoose = null;
        int currentMostLaidEggs = -1;

        for (Animal animal : farm.getAnimals()) {
            if (animal instanceof Goose goose) {
                if (goose.getLaidEggs() > currentMostLaidEggs) {
                    currentGoldenGoose = goose;
                    currentMostLaidEggs = goose.getLaidEggs();
                }
            }
        }
        return currentGoldenGoose;
    }

    public Goose findPlatinumGoose(Farm farm) {
        Optional<Goose> platinumGoose = farm.getAnimals().stream()
                .filter(a -> a instanceof Goose)
                .map(a -> (Goose) a)
                .max(Comparator.comparingInt(Goose::getLaidEggs));

        return platinumGoose.orElse(null);
    }
}
