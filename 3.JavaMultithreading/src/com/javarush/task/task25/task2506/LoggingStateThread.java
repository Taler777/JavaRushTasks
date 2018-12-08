package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread thread;

    @Override
    public void run() {
        State currentState = thread.getState();
        System.out.println(thread.getState());
        while(currentState!=State.TERMINATED){
            if (currentState!= thread.getState()){
                currentState=thread.getState();
                System.out.println(currentState);
            }
        }
    }

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }
}
