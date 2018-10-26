package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String newString = " ";
        char[] chars = s.toCharArray();
        int countChar = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                countChar = 0;
            } else {
                countChar++;
                if (countChar == 1) {
                    newString += Character.toUpperCase(chars[i]);
                    continue;
                }
            }
            newString += chars[i];
        }
        System.out.println(newString);
    }
}
