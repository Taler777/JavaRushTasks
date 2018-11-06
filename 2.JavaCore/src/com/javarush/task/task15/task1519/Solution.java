package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value;
        int newValue;
        while (true) {
            value = reader.readLine();
            if (value.equals("exit")) break;

            if (Pattern.matches("-?\\d+[.]\\d+", value) || Pattern.matches("\\d+[.]\\d+", value)) {
                print(Double.parseDouble(value));
            } else if (Pattern.matches("-\\d+", value)) {
                value = value.substring(1, value.length());
                print(-Integer.parseInt(value));
            } else if (Pattern.matches("\\d+", value)) {
                if (Integer.parseInt(value) == 0 || Integer.parseInt(value) >= 128) {
                    print(Integer.parseInt(value));
                } else {
                    print(Short.parseShort(value));
                }
            } else print(value);
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
