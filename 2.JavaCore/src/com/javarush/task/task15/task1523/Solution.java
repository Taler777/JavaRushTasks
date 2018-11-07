package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    String name;
    int valueInt;
    double valueDouble;

    public Solution(String name) {
    }

    private Solution(int valueInt) {
    }

    protected Solution(double valueDouble) {
    }

    Solution() {
    }

    public static void main(String[] args) {

    }
}

