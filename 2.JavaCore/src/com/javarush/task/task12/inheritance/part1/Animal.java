package com.javarush.task.task12.inheritance.part1;

public class Animal {

    String brain = "Изначальное значение brain в классе Animal";
    String heart = "Изначальное значение heart в классе Animal";

    public static int animalCount = 7700000;

    static {
        System.out.println("Статический блок в классе Animal");
    }

    public Animal(String brain, String heart) {
        System.out.println("Выполняется конструктор базового класса Animal");
        System.out.println("Были ли уже проинициализированы переменные класса Animal?");
        System.out.println("Текущее значение статической переменной animalCount = " + animalCount);
        System.out.println("Текущее значение brain в классе Animal = " + this.brain);
        System.out.println("Текущее значение heart в классе Animal = " + this.heart);
        System.out.println("Были ли уже проинициализированы переменные класса Cat?");
        System.out.println("Текущее значение статической переменной catsCount = " + Cat.catsCount);

        this.brain = brain;
        this.heart = heart;
        System.out.println("Конструктор базового класса Animal завершил работу!");
        System.out.println("Текущее значение brain = " + this.brain);
        System.out.println("Текущее значение heart = " + this.heart);
    }
}

