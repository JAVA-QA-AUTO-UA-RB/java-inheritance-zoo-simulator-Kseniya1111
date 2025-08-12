package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;
import com.zoo.animals.ISleepable;

public   class Eagle extends Bird  implements IEatable, IPlayable, ISleepable {
    public Eagle (String name, int age, double weight, double wingSpan) {
        super(name,age,weight,wingSpan);
    }


  @Override
 public void uniqueBirdAction ()
 {  changeEnergy(-10);
     System.out.println("Орел вирішив почистити пір'я");
 }


    @Override
    public void sleep ()
    {  changeEnergy(+50);
        System.out.println("Орел виспався та добре почуваеться");
    }

    @Override
    public void eat ()
    {  changeEnergy(+40);
        System.out.println("Орел поїв та добре почуваеться");
    }


    @Override
    public void makeSound ()
    { System.out.println("Кріі-кріі!");}

    @Override
    public void fly()
    { changeEnergy(-50);
        System.out.println("Eagle налітався та зголоднів");
    }
    @Override
    public void play ()
    {
        changeEnergy(-20);
        System.out.println("Іііііііііі! - каже лев коли погрався");

    }

}