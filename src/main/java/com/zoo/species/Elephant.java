package com.zoo.species;

import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;
import com.zoo.animals.ISleepable;
import com.zoo.animals.Mammal;

public class Elephant  extends Mammal  implements IEatable, IPlayable, ISleepable {
    public Elephant (String name, boolean isGroomLong, int protect, String furColor, int age, double weight) {
        super(name, isGroomLong, protect, furColor, age,  weight);
    }

    @Override
    public void sleep() {
        changeEnergy(+30);
        System.out.println("Труба-ба-ба! - каже слон, коли виспався");

    }

    @Override
    public void makeSound() {
        changeEnergy(-30);
        System.out.println("Труба-ба-ба! - каже слон, коли щасливий");

    }

    @Override
    public void eat() {
        changeEnergy(+40);
        System.out.println("Труба-ба-ба! - каже слон, коли поїв");

    }

    public void walk()
    { changeEnergy(-70);
        System.out.println("Слон дуже втомився, хоче їсти та спати");}

    public void spraySelf() {
        changeEnergy(-30);
        System.out.println("Elephant  has spent a lot of water!");

    }

    public void move ()
    {
        changeEnergy(-40);
        System.out.println("Слон вирішив прогулятися та підтримати соціальні зв'язки");

    }

    @Override
    public void play ()
    {
        changeEnergy(-20);
        System.out.println("Слон награвся");

    }

}