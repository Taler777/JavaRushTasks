package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = reader.readLine();

            int count = 0;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                while (fileInputStream.available() > 0) {
                    if (fileInputStream.read() == 44) count++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(count);
            fileInputStream.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
