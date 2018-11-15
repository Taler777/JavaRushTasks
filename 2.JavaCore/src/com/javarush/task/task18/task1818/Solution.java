package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            String file3 = reader.readLine();
            FileOutputStream target = new FileOutputStream(file1, true);
            FileInputStream source1 = new FileInputStream(file2);
            FileInputStream source2 = new FileInputStream(file3);
            byte[] buffer = new byte[source1.available()];

            while (source1.available() > 0) {
                source1.read(buffer);
                target.write(buffer);
            }
            byte[] buffer2 = new byte[source2.available()];
            while (source2.available() > 0) {
                source2.read(buffer2);
                target.write(buffer2);
            }

            target.close();
            source1.close();
            source2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
