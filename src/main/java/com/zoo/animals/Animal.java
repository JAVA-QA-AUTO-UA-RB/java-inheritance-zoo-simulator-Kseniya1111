package com.zoo.animals;

public  abstract class Animal implements IEatable,ISleepable {
    protected String name;
   // protected int age;
   // protected double weight;
    private int energyLevel = 0;

    public Animal(String name) {
        this.name = name;
        //this.age = age;
      //  this.weight = weight;
        this.energyLevel = 100;
    }


    public void changeEnergy(int amount) {
        energyLevel += amount;
        if (energyLevel < 0) {
            energyLevel = 0;
        }
    }


    public abstract void sleep();
    public abstract void makeSound();
    public abstract void eat ();

     public void feedbackToPlay() {
        makeSound();
    }


    public void displayInfo() {
        System.out.println("Info about current  animal: Name: " + name);
    }

    public String getName() {
        return name;
    }

   // public int getAge() {
   //     return age;
  //  }

  //  public double getWeight() {
   //     return weight;
  //  }

    public int getEnergyLevel() {
        return energyLevel;
    }



}