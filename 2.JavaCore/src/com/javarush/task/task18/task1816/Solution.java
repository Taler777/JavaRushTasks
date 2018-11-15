package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader(args[0]);
            String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char symbol = 0;
            int count = 0;
            while (in.ready()) {
                symbol = (char) in.read();
                if (abc.contains(String.valueOf(symbol))) {
                    count++;
                }
            }
            System.out.println(count);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
