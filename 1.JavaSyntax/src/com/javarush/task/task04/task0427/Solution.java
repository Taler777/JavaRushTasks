package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        int number = Integer.parseInt(str);
        if (number >= 1 && number <= 999) {
            boolean even = number % 2 == 0 ? true : false;
            String result = even ? "четное " : "нечетное ";
            result += length == 1 ? "однозначное " : length == 2 ? "двузначное " : "трехзначное ";
            System.out.println(result + "число");
        }
    }
}
