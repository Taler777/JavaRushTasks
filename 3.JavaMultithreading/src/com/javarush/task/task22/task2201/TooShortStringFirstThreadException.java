package com.javarush.task.task22.task2201;

public class TooShortStringFirstThreadException extends RuntimeException {
    private String message;
    public TooShortStringFirstThreadException(String msg) {
        this.message = msg;
    }
    public String getMessage() {
        return this.message;
    }
}
