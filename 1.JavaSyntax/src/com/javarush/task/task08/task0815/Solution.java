package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Surname1", "Firstname1");
        hashMap.put("Surname2", "Firstname2");
        hashMap.put("Surname3", "Firstname3");
        hashMap.put("Surname4", "Firstname4");
        hashMap.put("Surname5", "Firstname5");
        hashMap.put("Surname6", "Firstname6");
        hashMap.put("Surname7", "Firstname7");
        hashMap.put("Surname8", "Firstname8");
        hashMap.put("Surname9", "Firstname9");
        hashMap.put("Surname10", "Firstname10");
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry pair : map.entrySet()) {
            if (pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
