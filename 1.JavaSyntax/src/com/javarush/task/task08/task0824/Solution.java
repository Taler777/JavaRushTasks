package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human son1 = new Human("Ted", true, 7);
        Human son2 = new Human("Fill", true, 13);
        Human daughter = new Human("Lily", false, 10);
        Human father = new Human("Fart", true, 50);
        father.children.add(son1);
        father.children.add(son2);
        father.children.add(daughter);
        Human mother = new Human("Polly", true, 44);
        mother.children.add(son1);
        mother.children.add(son2);
        mother.children.add(daughter);
        Human grandpa1 = new Human("Garry", true, 88);
        Human grandpa2 = new Human("Wary", true, 99);
        Human grandma1 = new Human("Mary", false, 77);
        Human grandma2 = new Human("Tery", false, 82);
        grandpa1.children.add(father);
        grandma1.children.add(father);
        grandpa2.children.add(mother);
        grandma2.children.add(mother);
        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
