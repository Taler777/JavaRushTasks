package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) ;
        else if (number1 == number2) System.out.println(3);
        else if (number2 == number3) System.out.println(1);
        else if (number1 == number3) System.out.println(2);
    }
}
