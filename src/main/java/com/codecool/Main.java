package com.codecool;

import com.codecool.animal.*;

public class Main {
    public static void main(String[] args) {
        FarmService farmService = new FarmService();
        Farm farm = new Farm();
        Cat cat = new Cat(3_280, 47);
        Dog dog = new Dog(24_200, 1, DogType.HUSKY);
        Cow cow = new Cow(808_100, 2);

        Goose goose = new Goose(8_070, 4);
        Goose platinum = new Goose(9_070, 5);

        goose.layEgg();
        goose.layEgg();
        platinum.layEgg();
        platinum.layEgg();
        platinum.layEgg();
        goose.layEgg();
        goose.layEgg();

        farm.addAnimals(cat, dog, cow, goose, platinum);
        farmService.interactWithEveryAnimal(farm);
        Goose goldenGoose = farmService.findPlatinumGoose(farm);
        System.out.println("goldenGoose = " + goldenGoose);
    }
}