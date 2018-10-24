package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];
        int evenCount = 0;
        int oddCount = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
            if (i % 2 == 0) evenCount += array[i];
            else oddCount += array[i];
        }
        if (evenCount > oddCount) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
