package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = 0; i < 20; i++) {
            if (mainList.get(i) % 3 == 0) list1.add(mainList.get(i));
            if (mainList.get(i) % 2 == 0) list2.add(mainList.get(i));
            if (mainList.get(i) % 3 != 0 && mainList.get(i) % 2 != 0) list3.add(mainList.get(i));
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for (int number : list) {
            System.out.println(number);
        }
    }
}
