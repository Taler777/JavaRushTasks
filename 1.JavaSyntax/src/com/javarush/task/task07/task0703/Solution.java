package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static final int COUNT = 10;
    public static void main(String[] args) throws Exception {
        String [] arrString = new String[10];
        int [] arrNumbers = new int [10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < COUNT; i++) {
            arrString[i] = bufferedReader.readLine();
            arrNumbers[i] = arrString[i].length();
        }
        for (int i = 0; i < COUNT; i++) {
            System.out.println(arrNumbers[i]);
        }
    }
}
