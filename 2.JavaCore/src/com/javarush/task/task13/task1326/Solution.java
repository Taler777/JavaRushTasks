package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader fromFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        ArrayList<Integer> arrayList = new ArrayList<>();
        String str;

        while ((str = fromFile.readLine()) != null) {
            int number = Integer.parseInt(str);
            if (number % 2 == 0) arrayList.add(number);
        }
        fromFile.close();
        bufferedReader.close();
        Collections.sort(arrayList);
        arrayList.forEach(i -> System.out.println(i));
    }
}
