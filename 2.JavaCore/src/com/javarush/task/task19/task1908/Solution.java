package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFile));
        int count = 0;
        StringBuilder sb = new StringBuilder();

        while (fileReader.ready()) {
            sb.append(fileReader.readLine());
        }
        String[] words = sb.toString().split(" ");
        for (String word : words) {
            try {
                int number = Integer.parseInt(word);
                fileWriter.write(String.valueOf(number) + " ");
            } catch (NumberFormatException e) {
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}