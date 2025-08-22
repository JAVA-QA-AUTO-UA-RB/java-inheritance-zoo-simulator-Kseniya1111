package com.zoo.animals;

abstract public class Bird extends Animal {
    protected double wingSpan;
    protected int age;
    protected double weight;


    public Bird(String name, int age, double weight, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;

    }

    @Override
    public void makeSound() {
        System.out.println("YI YI YI");
    }

    public void fly() {
        changeEnergy(-15);
    }

    abstract protected void uniqueBirdAction();

}