package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        int maxByte = 0;
        int nextByte;
        FileInputStream in = new FileInputStream(fileName);
        while (in.available() > 0) {
            nextByte = in.read();
            if (maxByte < nextByte) maxByte = nextByte;
        }
        in.close();
        System.out.println(maxByte);
    }
}
