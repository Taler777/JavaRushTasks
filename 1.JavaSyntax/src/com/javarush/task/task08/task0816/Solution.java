package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Vandamme", df.parse("APRIL 3 1980"));
        map.put("Norris", df.parse("MAY 1 1980"));
        map.put("Swartc", df.parse("JULY 1 1980"));
        map.put("Chan", df.parse("AUGUST 1 1980"));
        map.put("Lee", df.parse("SEPTEMBER 1 1980"));
        map.put("Lundgren", df.parse("NOVEMBER 1 1980"));
        map.put("DeNiro", df.parse("OCTOBER 1 1980"));
        map.put("Mortal", df.parse("FEBRUARY 1 1980"));
        map.put("Combat", df.parse("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Object o = pair.getValue();
            Date date = (Date) o;
            if (date.getMonth() + 1 >= 6 && date.getMonth()+1 <= 8) {
                iterator.remove(); // удаляю объект коллекции, который был взят этим итератором

            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Date> map = null;
//        try {
//            map = Solution.createMap();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        removeAllSummerPeople(map);
//
//        for (HashMap.Entry pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
    }
}
