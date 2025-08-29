package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {
    public Elephant(String name, boolean isGroomLong, int protect, String furColor, int age, double weight) {
        super(name, isGroomLong, protect, furColor, age, weight);
    }

    @Override
    public void sleep() {
        changeEnergy(+30);
        System.out.println("Слон,  ненадовго задрімав, енергії в нього після цього побільшало");

    }

    @Override
    public void makeSound() {
        changeEnergy(-30);
        System.out.println("Труба-ба-ба! - каже слон, коли щасливий");

    }

    @Override
    public void eat() {
        changeEnergy(+40);
        System.out.println("Cлон дуже щасливий, бо поїв");

    }

    public void spraySelf() {
        changeEnergy(30);
        System.out.println("Elephant  has spent a lot of water!");
        groom();

    }

    public void move() {
        changeEnergy(-40);
        System.out.println("Слон вирішив прогулятися та підтримати соціальні зв'язки");

    }

    @Override
    public void play() {
        changeEnergy(-20);
        System.out.println("Слон грається із своїм дитинчам");

    }

    @Override
    public void groom() {
        protect += 30;
        System.out.println("Слон потоптав землю і підняв пил — тепер його важко дістати. Захист: " + protect);
    }

}