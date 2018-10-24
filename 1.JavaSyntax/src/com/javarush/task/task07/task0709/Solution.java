package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int[] lengths = new int[5];
        int minLength = 0;
        int oneStringLength;
        String oneString = "";
        for (int i = 0; i < 5; i++) {
            oneString = bufferedReader.readLine();
            strings.add(oneString);
            oneStringLength = oneString.length();
            lengths[i] = oneStringLength;
        }
        minLength = lengths[0];
        for (int i = 0; i < 5; i++) {
            if (minLength > lengths[i]) minLength = lengths[i];
        }

        for (int i = 0; i < 5; i++) {
            if (minLength == lengths[i]) System.out.println(strings.get(i));
        }
    }
}
