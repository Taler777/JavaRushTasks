package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url;
        try {
            url = reader.readLine().trim();
            int index = url.indexOf("?");
            url = url.substring(index + 1);
            String[] array = url.split("&");
            String params = "";
            Double doubleValue = null;
            String stringValue = null;
            String objValue = null;
            for (String param : array) {
                if (!param.contains("=")) params += " " + param;

                else if (param.contains("obj=")) {
                    index = param.indexOf("=");
                    String paramOnly = param.substring(0, index);
                    params += " " + paramOnly;
                    objValue = param.substring(index + 1, param.length());
                } else {
                    index = param.indexOf("=");
                    param = param.substring(0, index);
                    params += " " + param;
                }
            }
            System.out.println(params.trim());

            try {
                alert(Double.parseDouble(objValue));
            } catch (Exception e) {
                if (objValue != null) alert(objValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
