package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream source = new FileInputStream(args[1]);
        FileOutputStream target = new FileOutputStream(args[2]);

        while (source.available() > 0) {
            int data = source.read();
            if (args[0].equals("-e")) {
                data += 5;
            } else if (args[0].equals("-d")) {
                data -= 5;
            }
            target.write(data);
        }
        source.close();
        target.close();
    }
}
