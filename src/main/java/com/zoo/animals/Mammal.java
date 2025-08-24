package com.zoo.animals;

public abstract class Mammal extends Animal {
    boolean hasSpecialProtection;
    protected int protect;
    protected String furColor;
    protected int age;
    protected double weight;

    public Mammal(String name, boolean isGroomLong, int protect, String furColor, int age, double weight) {
        super(name);
        this.hasSpecialProtection = isGroomLong;
        this.protect = protect;
        this.furColor = furColor;
        this.age = age;
        this.weight = weight;
    }


    @Override
    public void makeSound() {
        System.out.println("YYYYYY");
    }

    public int getProtect() {
        return protect;
    }


    public abstract void groom();


    protected abstract void move();
}