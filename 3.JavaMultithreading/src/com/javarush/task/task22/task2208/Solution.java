package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukrain");
        map.put("city", "Kiev");
        map.put("zip", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        //name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                sb
                        .append(pair.getKey())
                        .append(" = '")
                        .append(pair.getValue())
                        .append("' and ");
            }
        }

        int cutterIndex = sb.lastIndexOf(" and ");
        int len = sb.length();
        String result = "";
        if (cutterIndex > 0) {
            result = sb.substring(0, cutterIndex);
        } else {
            result = sb.toString();
        }
        return result;
    }
}
