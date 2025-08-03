package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion  extends Mammal {

    public Lion(String name, int age, double weight,boolean isGroomLong,int protect,String furColor) {
    super(name,age,weight, isGroomLong, protect, furColor );
}
    @Override
    public void makeSound() {
        System.out.println("'Pр-рррр-рррр' робить лев, коли з ним награлись");

    }
    public void hunt()
    {
        changeEnergy(-25);
        System.out.println("Лев " + this.name + " пішов на охоту та йому потрібно буде багато енергії впродовж дня ( в нас величезний Сафарі парк)...");
    }
}

