package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        // массив символов
        char[] abcArray = abc.toCharArray();

        //список символов
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        //Список строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] count = new int[33];
        for (int n = 0; n < alphabet.size(); n++) {//берем символ из (коллекции) списка символов
            for (String currentStr : list) {//берем строку из (коллекции) списка строк
                for (int i = 0; i < currentStr.length(); i++) {
                    if (currentStr.charAt(i) == alphabet.get(n)) count[n]++;
                }
            }
        }
        for (int i = 0; i < 33; i++) {
            System.out.println(abcArray[i] + " " + count[i]);
        }
    }

}
