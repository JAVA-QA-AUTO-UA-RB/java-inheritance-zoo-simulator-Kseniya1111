package com.zoo.animals;

public abstract class Animal implements IEatable, ISleepable, IPlayable {
    protected String name;
    private int energyLevel = 100;
    protected int age;
    protected double weight;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sleep();

    public abstract void makeSound();

    public abstract void eat();

    public void changeEnergy(int amount) {
        energyLevel += amount;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }

    public void displayInfo() {
        System.out.println("Info about current  animal: Name: " + name);
    }

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }


}