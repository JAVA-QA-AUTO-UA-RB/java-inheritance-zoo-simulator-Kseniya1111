package com.zoo.species;

import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;
import com.zoo.animals.ISleepable;
import com.zoo.animals.Mammal;

public class Lion  extends Mammal  implements IEatable, IPlayable, ISleepable {

    public Lion(String name, int age, double weight,boolean isGroomLong,int protect,String furColor) {
        super(name, isGroomLong, protect, furColor, age,  weight);
    }

    @Override
    public void sleep() {
        changeEnergy(+40);
        System.out.println("Лев робить потягушкі коли виспався");
    }

    @Override
    public void makeSound() {
        System.out.println("'Pр-рррр-рррр' робить лев, коли з ним награлись");

    }

    @Override
    public void eat() {
        changeEnergy(+40);
        System.out.println("РРРРРРРРР! - каже лев коли поїв");

    }

    public void hunt()
    {
        changeEnergy(-25);
        System.out.println("Лев " + this.name + " пішов на охоту та йому потрібно буде багато енергії впродовж дня ( в нас величезний Сафарі парк)...");
    }

    public void move ()
    {
        changeEnergy(-40);
        System.out.println("Лев вирішив оглянути територію парку  та дуже втомився");

    }

    @Override
    public void play ()
    {
        changeEnergy(-20);
        System.out.println("РРРРРРРРР! - каже лев коли погрався");

    }
}