package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) System.out.println(number1 + " " + number2 + " " + number3);
        else if (number1 == number2) System.out.println(number1 + " " + number2);
        else if (number2 == number3) System.out.println(number2 + " " + number3);
        else if (number1 == number3) System.out.println(number1 + " " + number3);
    }
}