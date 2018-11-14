package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        FileInputStream in;
        while (true) {
            try {
                fileName = reader.readLine();
                in = new FileInputStream(fileName);
                if (in.available() < 1000) {
                    reader.close();
                    in.close();
                    throw new DownloadException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
