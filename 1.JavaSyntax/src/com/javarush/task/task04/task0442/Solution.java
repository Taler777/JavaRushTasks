package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int number = 0;
        while (true) {
            number = Integer.parseInt(bufferedReader.readLine());
            sum += number;
            if (number == -1) break;
        }
        System.out.println(sum);
    }
}
