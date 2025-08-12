package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;
import com.zoo.animals.ISleepable;

public class Penguin extends Bird  implements IPlayable, IEatable, ISleepable {

    public Penguin (String name, int age, double weight, double wingSpan ) {
        super(name,age,weight,wingSpan);
    }

    @Override
    public void sleep() {
        changeEnergy(+40);
        System.out.println("Пінгвін поспав та задоволений");
    }

    @Override
    public void makeSound ()
    {
        System.out.println("Кря-кря!");
    }

    @Override
    public void eat() {
        changeEnergy(+40);
        System.out.println("Пінгвін поїв та задоволений");
    }



    private void swim ()
    {
        changeEnergy(-20);
        System.out.println("Пінгвін поплавав  за рибами у льодяній воді.");
    }
    @Override
    public void fly()
    { swim();
    }

    @Override
    public void uniqueBirdAction ()
    {
        changeEnergy(-20);
        System.out.println("Пінгвін доглядає за пташенятами");

    }
    @Override
    public void play ()
    {
        changeEnergy(-20);
        System.out.println("пінгвін погрався");

    }


}