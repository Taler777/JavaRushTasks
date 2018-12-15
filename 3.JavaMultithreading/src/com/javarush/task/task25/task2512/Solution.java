package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        List<Throwable> exceptions = new ArrayList<>();

        exceptions.add(e);
        while ((e = e.getCause()) != null) {
            exceptions.add(e);
        }
        Collections.reverse(exceptions);
        for (Throwable element : exceptions) {
            System.out.println(element.toString());
        }
    }

    public static void main(String[] args) {
    }
}
