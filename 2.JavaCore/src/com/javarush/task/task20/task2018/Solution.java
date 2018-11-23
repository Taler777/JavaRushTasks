package com.javarush.task.task20.task2018;

import java.io.*;

/* 
Найти ошибки
*/
public class Solution implements Serializable{
    public static class A {

        protected String nameA = "A";

        // при десериализации производного класса (B), наследуемого от
        // несериализуемого класса (A), вызывается конструктор без параметров
        // родительского несериализуемого класса. И если такого конструктора
        // не будет - при десериализации возникнет ошибка java.io.InvalidClassException
        public A() {
        }

        public A(String nameA) {
            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {

        private String nameB;

        // конструктор десериализуемого класса не вызывается.
        // В процессе десериализации, поля (nameA) несериализуемых классов (A)
        // (родительских классов, не реализующих интерфейс Serializable)
        // инициируются конструктором без параметров.
        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }

        private void writeObject(ObjectOutputStream out) throws Exception {
            out.defaultWriteObject();
            out.writeObject(nameA);
            out.writeObject(nameB);
        }

        private void readObject(ObjectInputStream in) throws Exception {
            in.defaultReadObject();
            nameA = (String) in.readObject();
            nameB = (String) in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B) ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}
