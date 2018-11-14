package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(fileName);
        Map<Integer, Integer> map = new TreeMap<>();
        while ((in.available() > 0)) {
            int currentByte = in.read();
            if (map.containsKey(currentByte)) {
                int count = map.get(currentByte);
                map.put(currentByte, ++count);
            } else map.put(currentByte, 1);
        }
        in.close();
        int minCount = Collections.min(map.values());

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            if (minCount == (int) element.getValue()) {
                System.out.print(element.getKey() + " ");
            }
        }
    }
}
