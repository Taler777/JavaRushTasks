package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";
        while (!(fileName = reader.readLine()).equals("exit")) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        public String fileName;
        public static final String LOCK = "LOCK";

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            int result = 0;
            try {
                FileInputStream in = new FileInputStream(fileName);
                int[] array = new int[256];
                while (in.available() > 0) {
                    int index = in.read();
                    array[index]++;
                }
                int max = 0;
                result = 0;
                for (int i = 0; i < array.length; i++) {
                    if (max < array[i]) {
                        max = array[i];
                        result = i;
                    }
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            synchronized (LOCK) {
                resultMap.put(fileName, result);
            }
        }
    }
}