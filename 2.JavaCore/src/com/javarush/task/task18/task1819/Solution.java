package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            FileInputStream in1 = new FileInputStream(file1);

            FileOutputStream out = new FileOutputStream(file1);
            FileInputStream in2 = new FileInputStream(file2);
            byte[] buffer1 = new byte[in1.available()];
            in1.read(buffer1);
            byte[] buffer2 = new byte[in2.available()];
            in2.read(buffer2);
            out.write(buffer2);
            out.write(buffer1);
            in1.close();
            in2.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
