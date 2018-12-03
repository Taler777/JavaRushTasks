package com.javarush.task.task23.task2307;

/* 
Как выбрать нужное?
*/
public class Solution {
    public static final String TEST = "test";

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }

    static Object obj;

    //В методе main присвой объекту Object obj экземпляр класса TEST.
    public static void main(String[] args) {
        obj =  new Solution.TEST();
        System.out.println(obj);
    }
}
