package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String firstFile = reader.readLine();
            String secondFile = reader.readLine();
            FileInputStream in = new FileInputStream(firstFile);
            FileOutputStream out = new FileOutputStream(secondFile);
            if (in.available() > 0) {
                byte[] buffer = new byte[in.available()];
                in.read(buffer);
                for (int i = buffer.length - 1; i >= 0; i--) {
                    out.write(buffer[i]);
                }
            }
            reader.close();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
