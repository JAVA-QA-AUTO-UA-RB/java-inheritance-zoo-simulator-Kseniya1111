package com.zoo.animals;

public class Bird extends Animal {
    protected double wingSpan;

    public Bird(String name, int age, double weight, double wingSpan) {
        super(name, age, weight);
        this.wingSpan = wingSpan;

    }

    @Override
    public void makeSound() {
        System.out.println("YI YI YI");
    }

    public void fly()
    { changeEnergy(15);
    }

}



