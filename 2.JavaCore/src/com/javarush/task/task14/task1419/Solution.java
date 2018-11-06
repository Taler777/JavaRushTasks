package com.javarush.task.task14.task1419;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[10];
            array[11] = 5;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList arrays = new ArrayList<>();
            arrays.add(new Integer(111));
            System.out.println((String) arrays.get(0));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList arrays = new ArrayList<>();
            arrays.add(new Integer(111));
            System.out.println(arrays.get(7));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new EOFException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new FileSystemAlreadyExistsException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new InterruptedException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
