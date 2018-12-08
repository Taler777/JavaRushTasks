package com.javarush.task.task25.task2508;

// 1. Класс TaskManipulator должен реализовывать интерфейсы Runnable и CustomThreadManipulator.
public class TaskManipulator implements Runnable, CustomThreadManipulator {
    // 3. Класс TaskManipulator должен иметь внутреннее поле типа Thread.
    Thread thread;

    @Override
    public void run() {
        // 2. Метод run должен каждые 100 миллисекунд выводить имя исполняемой нити в консоль.
        while (!thread.isInterrupted()) {
            System.out.println(thread.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }

    //4. Метод start должен создавать, сохранять во внутреннее поле и запускать нить с именем, которое передано через аргумент метода.
    @Override
    public void start(String threadName) {
        thread = new Thread(this);
        thread.setName(threadName);
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
