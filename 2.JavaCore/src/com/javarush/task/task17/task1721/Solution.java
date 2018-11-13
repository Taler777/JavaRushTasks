package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();
    public static String firstFile;
    public static String seconfFile;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFile = reader.readLine();
            seconfFile = reader.readLine();
            reader.close();

            try {
                BufferedReader fromFirstFile = new BufferedReader(new InputStreamReader(new FileInputStream(firstFile)));
                BufferedReader fromSecondFile = new BufferedReader(new InputStreamReader(new FileInputStream(seconfFile)));
                String str;

                while ((str = fromFirstFile.readLine()) != null) {
                    allLines.add(str);
                }

                while ((str = fromSecondFile.readLine()) != null) {
                    forRemoveLines.add(str);
                }
                fromFirstFile.close();
                fromSecondFile.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            new Solution().joinData();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void joinData() throws CorruptedDataException {
        int count = 0;
        for (String line : forRemoveLines) {
            if (allLines.contains(line)) count++;
        }
        if (count == forRemoveLines.size()) {
            for (String line : forRemoveLines) {
                allLines.remove(line);
            }
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
