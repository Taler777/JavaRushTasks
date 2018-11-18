package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");

        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");
            String dateString = "";
            String name = "";
            for (int i = 0; i < str.length - 3; i++) {
                name += str[i] + " ";
            }
            name = name.trim();

            if (str[str.length - 3].length() == 1) str[str.length - 3] = "0" + str[str.length - 3];
            if (str[str.length - 2].length() == 1) str[str.length - 2] = "0" + str[str.length - 2];
            dateString = str[str.length - 3] + " " + str[str.length - 2] + " " + str[str.length - 1];

            Date birthDate = simpleDateFormat.parse(dateString);
            PEOPLE.add(new Person(name, birthDate));
        }
        reader.close();
    }
}
