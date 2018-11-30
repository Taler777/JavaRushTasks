package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));
//        System.out.println(Arrays.toString(getTokens("com.javarush.task.task22.task2210", ".")));
//        System.out.println(Arrays.toString(getTokens("level 22.lesson 13.task 01", ".")));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            result[index++] = tokenizer.nextToken();
        }
        return result;
    }
}
