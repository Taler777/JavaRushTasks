package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            FileReader fr = new FileReader(fileName);

            while (in.ready()) {
                String currentString = in.readLine();
                if (currentString.startsWith(args[0]+" ")) {
                    System.out.println(currentString);
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
