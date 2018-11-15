package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(file1));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
            ArrayList<String> arrayString = new ArrayList<>();
            while (fileReader.ready()) {
                arrayString.addAll(Arrays.asList(fileReader.readLine().split(" ")));
            }
            ArrayList<Long> arrayLong = new ArrayList<>();

            for (String number : arrayString) {
                arrayLong.add(Math.round(Double.valueOf(number)));
            }

            StringBuilder sb = new StringBuilder();
            sb.append(arrayLong.get(0));
            for (int i = 1; i < arrayLong.size(); i++) {
                sb.append(" ").append(arrayLong.get(i));
            }

            fileWriter.write(sb.toString());

            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
