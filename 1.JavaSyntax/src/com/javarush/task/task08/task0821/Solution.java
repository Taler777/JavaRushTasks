package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Stallone", "Silvester");
        map.put("Vandamme", "Jan");
        map.put("Norris", "Jan");
        map.put("Swartc", "Arni");
        map.put("Chan", "Jacky");
        map.put("Chan", "Jet");
        map.put("Lundgren", "Dolf");
        map.put("DeNiro", "Robert");
        map.put("Mortal", "M");
        map.put("Chan", "C");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
