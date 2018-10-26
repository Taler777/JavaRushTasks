package com.javarush.task.task08.task0820;

import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        result.add(dog1);
        result.add(dog2);
        result.add(dog3);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            pets.add(catIterator.next());
        }
        Iterator<Dog> dogIterator = dogs.iterator();
        while (dogIterator.hasNext()) {
            pets.add(dogIterator.next());
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            pets.remove(catIterator.next());
        }
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
