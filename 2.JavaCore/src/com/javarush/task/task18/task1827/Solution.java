package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
        if (args.length != 0 && args[0].equals("-c")) {
            int maxId = 0;
            while (fileReader.ready()) {
                String item = fileReader.readLine();
                int currentId = Integer.parseInt(item.substring(0, 8).trim());
                if (maxId < currentId) maxId = currentId;
            }
            maxId++;
            String newItem =String.format("\n%-8s%-30s%-8s%-4s", maxId, args[1], args[2], args[3]);
            fileWriter.write(newItem);
        }
        fileReader.close();
        fileWriter.close();
    }
}
