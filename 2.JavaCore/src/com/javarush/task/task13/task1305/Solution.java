package com.javarush.task.task13.task1305;

/* 
Четыре ошибки
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        Hobby HOBBY = new Hobby(); // 1. Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
    }
// 2. Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
// 3. Класс Hobby должен быть объявлен с модификатором доступа static.
    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
