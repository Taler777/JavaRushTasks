package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(args[0])));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(args[1])));
        ) {

            byte[] buffer = new byte[1000];
            Charset utf8 = Charset.forName("UTF-8");
            Charset windows1251 = Charset.forName("Windows-1251");
            while (in.available() > 0) {
                in.read(buffer);
                String s = new String(buffer, windows1251);
                buffer = s.getBytes(utf8);
                out.write(buffer);
            }
        } catch (IOException e) {

        }
    }
}
