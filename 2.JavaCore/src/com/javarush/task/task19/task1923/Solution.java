package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String regex = ".*\\d.*";
        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for (String word : words) {
                //на больших объемах лучше использовать Pattern
                if (word.matches(regex)) writer.write(word + " ");
            }
        }
        reader.close();
        writer.close();
    }
}
