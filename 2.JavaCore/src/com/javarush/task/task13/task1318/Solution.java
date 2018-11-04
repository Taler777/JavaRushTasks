package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = null;
        String fileName;
        try {
            fileName = bufferedReader.readLine();
            in = new FileInputStream(fileName);
            int x;
            while ((x = in.read()) != -1) { // читаю посимвольно
                System.out.print((char) x); // вывожу в консоль
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bufferedReader.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}