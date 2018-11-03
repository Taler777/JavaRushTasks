package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int id = 0;
        String name = "";
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            id = Integer.parseInt(s);
            name = reader.readLine();
            map.put(name, id);
        }
        map.forEach((key, value) -> System.out.println(value + " " + key));
    }
}
