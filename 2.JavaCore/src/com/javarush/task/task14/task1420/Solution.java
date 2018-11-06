package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = 0;
        int number2 = 0;
        try {
            number1 = Integer.parseInt(reader.readLine());
            number2 = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            throw e;
        }
        if (number1 <= 0 || number2 <= 0) throw new Exception();
        int nod = number1 > number2 ? number2 : number1;
        while (!(number1 % nod == 0 && number2 % nod == 0)) nod--;
        System.out.println(nod);
    }
}
