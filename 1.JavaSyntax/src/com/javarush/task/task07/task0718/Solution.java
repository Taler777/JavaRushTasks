package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int maxLength = 0;

        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }

        for (String word : list) {
            if (maxLength < word.length()) {
                maxLength = word.length();
                continue;
            } else if (maxLength == word.length()) {
                continue;
            } else if (maxLength > word.length()) {
                System.out.println(list.indexOf(word));
                break;
            }
        }
    }
}

