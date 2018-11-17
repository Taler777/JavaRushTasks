package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();
        FileReader in = new FileReader(firstFile);
        FileWriter out = new FileWriter(secondFile);
        int count=0;
        while (in.ready()) {
            int data = in.read();
            if (count%2 ==1){
                out.write(data);
            }
            count++;
        }
        in.close();
        out.close();
    }
}
