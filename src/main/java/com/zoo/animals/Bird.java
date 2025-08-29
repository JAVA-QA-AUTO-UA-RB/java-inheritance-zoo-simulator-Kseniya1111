package com.zoo.animals;

abstract public class Bird extends Animal {
    protected double wingSpan;


    public Bird(String name, int age, double weight, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
        this.age = age;
        this.weight = weight;
    }

    abstract protected void uniqueBirdAction();

    @Override
    public void makeSound() {
        System.out.println("YI YI YI");
    }

    public void fly() {
        changeEnergy(-15);
    }


}