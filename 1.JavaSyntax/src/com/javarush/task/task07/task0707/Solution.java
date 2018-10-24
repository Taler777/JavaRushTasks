package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Forth");
        arrayList.add("Fifth");
        System.out.println(arrayList.size());
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
