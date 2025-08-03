package com.zoo.animals;

public class Animal {
    protected String name;
    protected int age;
    protected double weight;
    private int energyLevel = 0;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = 100;
    }


    public void changeEnergy(int amount) {
        energyLevel += amount;
        if (energyLevel < 0) {
            energyLevel = 0;
        }
    }


    public void sleep() {
        energyLevel = energyLevel + 30;

    }

    protected void makeSound() {
        System.out.println("RRRRRRRR");
    }

    public void feedbackToPlay() {
        makeSound();
    }


    public void displayInfo() {
        System.out.println("Info about current  animal: Name: " + name + ",Age " + age + " ,Weight: " + weight);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }



}


