package com.javarush.task.task12.inheritance.part1;

public class Cat extends Animal {

    String tail = "Изначальное значение tail в классе Cat";

    static int catsCount = 37;
    static {
        System.out.println("Статический блок в классе Cat");
    }
    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        System.out.println("Конструктор класса Cat начал работу (конструктор Animal уже был выполнен)");
        System.out.println("Текущее значение статической переменной catsCount = " + catsCount);
        System.out.println("Текущее значение tail = " + this.tail);
        this.tail = tail;
        System.out.println("Текущее значение tail = " + this.tail);
    }

    public void saySomething(){
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Мозг", "Сердце", "Хвост");
        cat.saySomething();
        Animal cat2 = new Cat("1", "2", "3");
        ((Cat) cat2).saySomething();
    }
}
