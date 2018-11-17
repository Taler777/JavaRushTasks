package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String unsolved = byteArrayOutputStream.toString().replaceAll("\r\n", "");
        String[] str = unsolved.split(" ");
        int number1 = Integer.parseInt(str[0]);
        int number2 = Integer.parseInt(str[2]);
        int result = 0;
        if (str[1].equals("+")) result = number1 + number2;
        else if (str[1].equals("-")) result = number1 - number2;
        else result = number1 * number2;
        System.setOut(consoleStream);
        System.out.println(unsolved + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

