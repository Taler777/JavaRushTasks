package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = null;
        String newLine = "";
        try {
            String fileName = bufferedReader.readLine();
            out = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
        }
        try {
            while (true) {
                newLine = bufferedReader.readLine();
                if (newLine.equals("exit")) break;
                out.write(newLine);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.write(newLine);
                bufferedReader.close();
                out.close();
            } catch (IOException e) {
            }
        }
    }
}
