package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[2];

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Java1", "Scala1", "Groovy1"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java2", "Scala2", "Groovy2"));
        list[0] = list1;
        list[1] = list1;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}