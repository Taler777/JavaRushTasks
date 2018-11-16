package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            // Иванов Иван Иванович 31 12 1950
            String[] personInfo = fileScanner.nextLine().split(" ");
            Person person = null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            try {
                Date birthDate = simpleDateFormat.parse(personInfo[3] + " " + personInfo[4] + " " + personInfo[5]);
                person = new Person(personInfo[1], personInfo[2], personInfo[0], birthDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
