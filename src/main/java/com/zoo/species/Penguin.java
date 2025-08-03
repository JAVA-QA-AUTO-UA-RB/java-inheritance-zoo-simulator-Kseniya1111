package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {

    public Penguin (String name, int age, double weight, double wingSpan ) {
        super(name,age,weight,wingSpan);
    }

    @Override
    public void makeSound ()
    {
        System.out.println("Кря-кря! каже пінгвін, коли награлася з наглядачем:)");
    }
    private void swim ()
    {
        changeEnergy(-20);
    }
    @Override
    public void fly()
    { swim();
    }
}
