package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());

    }

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            while (true) ;
        }
    }

    public static class MyThread2 extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread3 extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class MyThread4 extends Thread implements Message {
        private boolean isStop = false;

        @Override
        public void showWarning() {
            isStop = true;
        }

        @Override
        public void run() {
            while (!isStop) {

            }
        }
    }

    public static class MyThread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        @Override
        public void run() {
            String value = "";
            int sum = 0;
            try {
                while (!(value = reader.readLine()).equals("N")) {
                    sum += Integer.parseInt(value);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(sum);
        }
    }
}