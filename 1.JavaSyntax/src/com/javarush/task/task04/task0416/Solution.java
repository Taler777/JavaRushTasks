package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double minutes = Double.parseDouble(scanner.nextLine());
        if (minutes % 5.0 >= 0 && minutes % 5.0 < 3) System.out.println("зеленый");
        else if (minutes % 5.0 >= 3 && minutes % 5.0 < 4) System.out.println("желтый");
        else System.out.println("красный");
    }
}