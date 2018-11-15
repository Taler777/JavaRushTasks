package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader(args[0]);
            int total = 0;
            int count = 0;
            while (in.ready()) {
                if (in.read() == 32) {
                    count++;
                }
                total++;
            }
            in.close();
            double result = (double) count / total *100;
            System.out.format("%.2f", result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
