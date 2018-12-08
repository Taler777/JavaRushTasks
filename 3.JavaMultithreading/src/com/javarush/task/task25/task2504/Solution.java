package com.javarush.task.task25.task2504;

;

/*
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread : threads) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case TIMED_WAITING:
                    thread.interrupt();
                    break;
                case BLOCKED:
                    thread.interrupt();
                    break;
                case WAITING:
                    thread.interrupt();
                    break;
                case RUNNABLE:
                    thread.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(thread.getPriority());
                    break;

                    /*
                    NEW — поток создан, но еще не запущен;

RUNNABLE — поток выполняется;

BLOCKED — поток блокирован;

WAITING — поток ждет окончания работы другого потока;

TIMED_WAITING — поток некоторое время ждет окончания другого потока;

TERMINATED — поток завершен.
                     */
            }
        }
    }

    public static void main(String[] args) {
    }
}
