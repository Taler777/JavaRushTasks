package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    String fileName;

    public Solution(String fileName) {
        this.fileName = fileName;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            try (FileInputStream fis = new FileInputStream(fileName)){
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
