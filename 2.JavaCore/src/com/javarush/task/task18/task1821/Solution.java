package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try {
            String fileName = args[0];
            FileReader in = new FileReader(fileName);
            Map<Integer, Integer> pair = new TreeMap<>();
            int count = 0;
            while (in.ready()) {
                int symbol = in.read();
                if (pair.containsKey(symbol)) {
                    count = pair.get(symbol) + 1;
                    pair.put(symbol, count);
                } else {
                    pair.put(symbol, 1);
                }
            }

            Iterator<Map.Entry<Integer, Integer>> iterator = pair.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> element = iterator.next();
                System.out.println((char) (int) (element.getKey()) + " " + element.getValue().toString());
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
