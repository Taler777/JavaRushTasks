package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String dateAsString = bufferedReader.readLine();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d");
        Date date = format.parse(dateAsString);

        SimpleDateFormat newFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(newFormat.format(date).toUpperCase());

    }
}
