package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader in = new FileReader(fileName);
        int count =0;
        StringBuilder sb = new StringBuilder();

        while(in.ready()){
            if (in.read() == 119) {
                if (in.read() == 111) {
                    if (in.read() == 114) {
                        if (in.read() == 108){
                            if (in.read() == 100) {
                                int data = in.read();
                                if (data==44 || data == 33 || data == 46 || data == 63 || data == 34 ||
                                        data == 39 || data == 58 || data == 59 || data == 10)
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}
