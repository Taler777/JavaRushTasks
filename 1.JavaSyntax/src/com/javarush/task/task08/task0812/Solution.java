package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int max = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
            // (int) привожу к примитивному типу, чтобы исключить кэширование значений Integer для чисел до 127
            if (i > 0 && (int) arrayList.get(i - 1) == (int) arrayList.get(i)) {
                count++;
                if (max < count) max = count;

            } else count = 1;
        }
        System.out.println(max);
    }
}