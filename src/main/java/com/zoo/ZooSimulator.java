package com.zoo;

import java.util.Scanner;

import com.zoo.animals.Animal;
import com.zoo.species.*;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 2, 35.2, false, 100, "brown");
        Eagle eagle = new Eagle("Hugo", 1, 10, 3);
        Penguin penguin = new Penguin("Robby", 1, 20, 0.5);
        Elephant elephant = new Elephant("Victor", false, 15, "grey", 20, 200.6);

        ZooKeeper Andrii = new ZooKeeper("Andrii");
        String answer;
        do {
            System.out.println("Вітаю тебе в зоопарку! Такі тваринки як лев Сімба, орел Х'юго, пінгвін Роббі та слон Віктор є  його постійними мешканцями!");
            System.out.println("Розпочнемо наш день з тваринками:) та з інструктором " + Andrii.getName());


            Scanner scanner = new Scanner(System.in);
            System.out.println("\nНатисніть Enter, щоб перейти до зоопарку..");
            scanner.nextLine();

            Andrii.feedAnimal(lion);
            Andrii.playWithAnimal(lion);
            lion.makeSound();
            lion.groom();
            lion.hunt();
            lion.move();
            Andrii.checkAnimalEnergyLevel(lion);


            System.out.println("\nНатисніть Enter, щоб перейти до наступної тваринки...");
            scanner.nextLine();

            Andrii.feedAnimal(elephant);
            Andrii.playWithAnimal(elephant);
            elephant.makeSound();
            elephant.spraySelf();
            elephant.move();
            elephant.sleep();
            Andrii.checkAnimalEnergyLevel(elephant);

            System.out.println("\nНатисніть Enter, щоб перейти до наступної тваринки...");
            scanner.nextLine();

            Andrii.feedAnimal(penguin);
            Andrii.playWithAnimal(penguin);
            penguin.makeSound();
            penguin.fly();
            penguin.sleep();
            penguin.uniqueBirdAction();
            Andrii.checkAnimalEnergyLevel(penguin);

            System.out.println("\nНатисніть Enter, щоб перейти до наступної тваринки...");
            scanner.nextLine();

            Andrii.feedAnimal(eagle);
            Andrii.playWithAnimal(eagle);
            eagle.makeSound();
            eagle.fly();
            eagle.sleep();
            eagle.uniqueBirdAction();
            Andrii.checkAnimalEnergyLevel(eagle);

            System.out.println("\nОсь і день минув! Натисніть Enter, щоб переглянути енергію звірят...");
            scanner.nextLine();

            System.out.println(lion.getName() + " має рівень енергії " + lion.getEnergyLevel());
            System.out.println(eagle.getName() + " має рівень енергії " + eagle.getEnergyLevel());
            System.out.println(penguin.getName() + " має рівень енергії " + penguin.getEnergyLevel());
            System.out.println(elephant.getName() + " має рівень енергії " + elephant.getEnergyLevel());

            System.out.println("\nЧи хочете пограти ще раз? (так/ні): ");
            answer = scanner.nextLine().trim().toLowerCase();
        } while (answer.equals("так"));

        System.out.println("До побачення! Дякуємо, що були з нами у зоопарку 🐾");

        System.out.println(" А тепер створюю масив та ще демонструю поліморфізм підтипів ");

        Animal[] animals = {lion, eagle, penguin, elephant};

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.eat();
            animal.sleep();
        }

    }

}