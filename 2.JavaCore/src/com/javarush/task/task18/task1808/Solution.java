package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String firstFile = reader.readLine();
            String secondFile = reader.readLine();
            String thirdFile = reader.readLine();
            FileInputStream in = new FileInputStream(firstFile);
            FileOutputStream secondFileOut = new FileOutputStream(secondFile);
            FileOutputStream thirdFileOut = new FileOutputStream(thirdFile);
            if (in.available() > 0) {
                byte[] buffer = new byte[in.available()];

                in.read(buffer);
                int part1 = buffer.length / 2 + buffer.length % 2;
                for (int i = 0; i < part1; i++) {
                    secondFileOut.write(buffer[i]);
                }
                for (int i = part1; i < buffer.length; i++) {
                    thirdFileOut.write(buffer[i]);
                }
            }
            reader.close();
            in.close();
            secondFileOut.close();
            thirdFileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
