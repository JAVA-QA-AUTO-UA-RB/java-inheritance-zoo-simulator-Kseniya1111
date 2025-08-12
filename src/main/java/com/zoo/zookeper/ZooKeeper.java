package com.zoo.zookeper;


import com.zoo.animals.Animal;
import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;

public class ZooKeeper {
    private String name;

    public void feedAnimal(IEatable animal) {
        String animalType = animal.getClass().getSimpleName();
        animal.changeEnergy(+5);
        System.out.println("Наглядач " + this.name + " годує тварину " + animalType +  " на ім'я " + animal.getName());
        System.out.println("Тваринка поїла та задоволена, її енергії знов стало більше:) ");
    }


    public void playWithAnimal(IPlayable animal)
    { animal.changeEnergy(-25);
        System.out.println("Тваринка " +  animal.getName() + " захотіла гратися з " + this.name + " , гралися вони довгенько, тому енергії в не поменьшало... ");
        animal.feedbackToPlay();

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

    public  ZooKeeper (String name) {
        this.name = name;
    }
    public String getZooKeeperName() {
        return name;
    }
}