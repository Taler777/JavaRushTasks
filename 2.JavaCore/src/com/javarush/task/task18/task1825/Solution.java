package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileList = new ArrayList<>();
        String fileName = "";
        while (!(fileName = reader.readLine()).equals("end")) {
            fileList.add(fileName);
        }
        Collections.sort(fileList);
        String targetFileName = fileList.get(0).split(".part[0-9]+")[0];
        File targetFile = new File(targetFileName);
        targetFile.createNewFile();
        FileOutputStream out = new FileOutputStream(targetFile);
        for (String file : fileList) {
            FileInputStream in = new FileInputStream(file);
            byte[] buffer = new byte[in.available()];
            in.read(buffer);
            out.write(buffer);
            in.close();
        }
        out.close();
        reader.close();
    }
}
