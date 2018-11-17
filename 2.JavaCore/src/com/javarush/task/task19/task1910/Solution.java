package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFile));

        while (fileReader.ready()) {
            String currentLine = fileReader.readLine();
            currentLine = currentLine.replaceAll("\\p{Punct}", "");
            currentLine = currentLine.replaceAll("\n", "");
            fileWriter.write(currentLine+"\n");
        }

        fileReader.close();
        fileWriter.close();
    }
}
