package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Stallone", 100);
        map.put("Vandamme", 300);
        map.put("Norris", 400);
        map.put("Swartc", 500);
        map.put("Chan", 600);
        map.put("Lee", 700);
        map.put("Lundgren", 800);
        map.put("DeNiro", 900);
        map.put("Mortal", 1000);
        map.put("Combat", 1200);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if ((int) pair.getValue() < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}