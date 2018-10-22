package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        for (int i = 0; i < 3; i++) {
            int number = scanner.nextInt();
            if (number > 0) a++;
            else if (number < 0) b++;
        }
        System.out.println("количество отрицательных чисел: " + b);
        System.out.println("количество положительных чисел: " + a);
    }
}
