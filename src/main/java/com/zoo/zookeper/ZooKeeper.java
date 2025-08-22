package com.zoo.zookeper;


import com.zoo.animals.Animal;


public class ZooKeeper {
    private final String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println("Наглядач " + this.name + " годує тварину  на ім'я " + animal.getName());

        animal.eat();
        System.out.println("Тваринка поїла та задоволена, її енергії знов стало більше:) ");
    }


    public void playWithAnimal(Animal animal) {
        animal.play();
        System.out.println("Тваринка " + animal.getName() + " захотіла гратися з " + this.name + " , гралися вони довгенько, тому енергії в не поменьшало... ");


    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        if (energy >= 0 && energy <= 30) {
            System.out.println("Звірятко має низький рівень енергії!");
        } else if (energy >= 31 && energy <= 70) {
            System.out.println("Звірятко має середній рівень енергії!");
        } else if (energy >= 71 && energy <= 100) {
            System.out.println("Звірятко має високий рівень енергії!");
        } else {
            System.out.println("Рівень енергії поза межами звірятка,вона буде активна впродовж декількох годин!");

        }

    }


    public String getName() {
        return name;
    }
}