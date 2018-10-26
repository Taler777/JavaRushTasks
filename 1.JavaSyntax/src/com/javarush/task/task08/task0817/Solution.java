package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Stallone", "Silvester");
        map.put("Vandamme", "Jan");
        map.put("Norris", "Chuck");
        map.put("Swartc", "Arni");
        map.put("Chan", "Jacky");
        map.put("Lee", "Jet");
        map.put("Lundgren", "Dolf");
        map.put("DeNiro", "Robert");
        map.put("Mortal", "M");
        map.put("Combat", "C");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            int curSize = map.size();
            removeItemFromMapByValue(map, pair.getValue());
            if (curSize - map.size() == 1)
                map.put(pair.getKey(), pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
