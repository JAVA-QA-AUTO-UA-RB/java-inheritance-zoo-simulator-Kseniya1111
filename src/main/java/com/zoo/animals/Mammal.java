package com.zoo.animals;

public abstract class Mammal extends Animal {
    boolean selfProtectionLevel;
    int protect;
    protected String furColor;
    protected int age;
    protected double weight;

    public Mammal(String name, boolean isGroomLong, int protect, String furColor, int age, double weight) {
        super(name);
        this.selfProtectionLevel = isGroomLong;
        this.protect = protect;
        this.furColor = furColor;
        this.age = age;
        this.weight = weight;
    }


    @Override
    public void makeSound() {
        System.out.println("YYYYYY");
    }

    public void groom() {
        if (selfProtectionLevel) {
            protect = protect * 2;
        } else {
            System.out.println("Ця тварина мае звичайний ступинь захисту");
        }

    }


    protected abstract void move();
}