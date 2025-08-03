package com.zoo.animals;

public class Mammal extends Animal {
    boolean isGroomLong;
    int protect;
    protected String furColor;

    public Mammal(String name, int age, double weight, boolean isGroomLong, int protect, String furColor) {
        super(name, age, weight);
        this.isGroomLong = isGroomLong;
        this.protect = protect;
        this.furColor = furColor;
    }



    @Override
    public void makeSound() {
        System.out.println("YYYYYY");
    }

    public void groom() {
        if (isGroomLong) {
            protect = protect * 2;
        } else
            System.out.println("Ця тварина мае звичайний ступинь захисту");

    }
}
