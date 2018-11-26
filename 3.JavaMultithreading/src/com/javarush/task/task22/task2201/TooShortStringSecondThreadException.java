package com.javarush.task.task22.task2201;

public class TooShortStringSecondThreadException extends RuntimeException {
    private String message;
    public TooShortStringSecondThreadException(String msg) {
        this.message = msg;
    }
    public String getMessage() {
        return this.message;
    }
}
