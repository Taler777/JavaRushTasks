package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigArray = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];
        for (int i = 0; i < 20; i++) {
            if (i < 10) smallArray1[i] = bigArray[i];
            else smallArray2[i - 10] = bigArray[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(smallArray2[i]);
        }
    }
}
