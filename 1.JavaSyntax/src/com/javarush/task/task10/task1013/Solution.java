package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String secondName;
        private String nickName;
        private int age;
        private int weight;
        private int height;


        public Human(String firstName, String secondName, int age, int weight) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.weight = weight;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, String secondName, String nickName, int age) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.nickName = nickName;
            this.age = age;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human(String firstName, String secondName, String nickName) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.nickName = nickName;
        }

        public Human(String firstName, String secondName, String nickName, int age, int weight) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.nickName = nickName;
            this.age = age;
            this.weight = weight;
        }

        public Human(String firstName, String secondName, String nickName, int age, int weight, int height) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.nickName = nickName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, int age, int weight) {
            this.firstName = firstName;
            this.age = age;
            this.weight = weight;
        }

        public Human(String firstName, String secondName, int age) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }
    }
}
