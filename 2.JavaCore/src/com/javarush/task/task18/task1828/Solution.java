package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
        if (args.length != 0) {
            ArrayList<String> arrayList = new ArrayList<>();
            while (fileReader.ready()) {
                String currentItem = fileReader.readLine();
                String currentId = currentItem.substring(0, 8).trim();
                if (args[1].trim().equals(currentId)) {
                    //-u - обновляет данные товара с заданным id
                    if (args[0].equals("-u")) { // -u id productName price quantity
                        currentItem = String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]);

                        // -d - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)
                    } else if (args[0].equals("-d")) { // -d id
                        continue;
                    }
                }
                arrayList.add(currentItem);
            }
            for (String item : arrayList) {
                fileWriter.write(item + "\n");
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}