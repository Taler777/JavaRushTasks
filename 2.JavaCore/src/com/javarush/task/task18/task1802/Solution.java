package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(fileName);
        int minByte = Integer.MAX_VALUE;
        int nextByte = 0;
        while (in.available() > 0) {
            nextByte = in.read();
            if (minByte > nextByte) minByte = nextByte;
        }
        in.close();
        System.out.println(minByte);
    }
}
