package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        String word;
        for (int i = 0; i < list.size(); i++) {
            word = list.get(i);
            if (word.contains("л") && word.contains("р")) continue;
            if (word.contains("р")) {
                list.remove(i);
                i--;
            } else if (word.contains("л")) {
                list.add(i, word);
                i++;
            }
        }
        return list;
    }
}