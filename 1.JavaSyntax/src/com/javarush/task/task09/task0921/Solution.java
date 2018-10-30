package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                arrayList.add(Integer.parseInt(bufferedReader.readLine()));
            } catch (IOException e) {

            } catch (NumberFormatException e) {
                //arrayList.forEach(number -> System.out.println(number)); или так вывод сделать
                for (Integer number : arrayList) {
                    System.out.println(number);
                }
                break;
            }
        }
    }
}
