package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> longWords = new ArrayList<>();
        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for (String word : words) {
                if (word.length() > 6) longWords.add(word);
            }
        }

        for (int i = 0; i < longWords.size() - 1; i++) {
            writer.write(longWords.get(i) + ",");
        }
        writer.write(longWords.get(longWords.size() - 1));

        reader.close();
        writer.close();
    }
}
