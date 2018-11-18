package com.javarush.task.task19.task1918;

/*
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        while (fileReader.ready()) {
            sb.append(fileReader.readLine());
        }
        int currentPosition = 0;
        ArrayList<Integer> positionsOpenTag = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        while ((currentPosition = sb.indexOf(args[0], currentPosition)) != -1) {
            if (sb.substring(currentPosition - 1, currentPosition + args[0].length()).equals("<" + args[0])) {
                positionsOpenTag.add(0, currentPosition - 1);
                results.add("empty");
            } else if (sb.substring(currentPosition - 1, currentPosition + args[0].length()).equals("/" + args[0])) {
                int change = 0;
                for (int i = results.size() - 1; i >= 0; i--) {
                    if (results.get(i).equals("empty") && change == 0) {
                        String currentString = sb.substring(positionsOpenTag.remove(0), currentPosition + args[0].length() + 1);
                        results.set(i, currentString);
                        change++;
                    }
                }
            }
            currentPosition++;
        }
        for (String line : results) {
            System.out.println(line);
        }
        fileReader.close();
    }
}