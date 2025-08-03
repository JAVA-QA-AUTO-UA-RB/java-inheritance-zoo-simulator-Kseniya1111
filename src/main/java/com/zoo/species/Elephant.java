package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant  extends Mammal {
 public Elephant (String name, int age, double weight, boolean isGroomLong, int protect, String furColor) {
     super(name,age, weight,isGroomLong, protect, furColor);
 }

    @Override
    public void makeSound() {
        changeEnergy(-30);
        System.out.println("Труба-ба-ба! - каже слон, коли щасливий");

    }
    public void walk()
    { changeEnergy(-70);
    System.out.println("Слон дуже втомився, хоче їсти та спати");}

    public void spraySelf() {
     changeEnergy(-30);
        System.out.println("Elephant  has spent a lot of water!");

    }
}
