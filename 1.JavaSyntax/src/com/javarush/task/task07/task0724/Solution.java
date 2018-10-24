package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {

    public static void main(String[] args) {
        Human grandpa1 = new Human("Name1", true, 20);
        Human grandpa2 = new Human("Name2", true, 20);
        Human grandma1 = new Human("Name3", true, 20);
        Human grandma2 = new Human("Name4", true, 20);
        Human father = new Human("Name5", true, 20, grandpa1, grandma1);
        Human mother = new Human("Name6", true, 20, grandpa2, grandma2);
        Human child1 = new Human("Name7", true, 20, father, mother);
        Human child2 = new Human("Name8", true, 20, father, mother);
        Human child3 = new Human("Name9", true, 20, father, mother);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}