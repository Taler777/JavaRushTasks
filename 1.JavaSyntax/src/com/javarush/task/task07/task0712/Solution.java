package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        /*
        3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
         */
        int min = strings.get(0).length();
        int max = strings.get(0).length();
        int minPosition = 0;
        int maxPosition = 0;
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
                maxPosition = i;
            } else if (strings.get(i).length() < min) {
                min = strings.get(i).length();
                minPosition = i;
            }
        }
        if (minPosition < maxPosition) {
            System.out.println(strings.get(minPosition));
        } else {
            System.out.println(strings.get(maxPosition));
        }
    }
}
