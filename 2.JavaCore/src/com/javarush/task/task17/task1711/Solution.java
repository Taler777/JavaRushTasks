package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c": synchronized (allPeople){ // -c name1 sex1 bd1 name2 sex2 bd2 ...
                Person person = null;
                for (int i = 1; i <= (args.length - 3); i += 3) {
                    if (args[i + 1].equals("м")) {
                        try {
                            person = Person.createMale(args[i], simpleDateFormat.parse(args[i + 2]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else if (args[2].equals("ж")) {
                        try {
                            person = Person.createFemale(args[i], simpleDateFormat.parse(args[i + 2]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    allPeople.add(person);
                    System.out.println(allPeople.size() - 1);
                }
                break;
            }
            case "-u": synchronized (allPeople){ // -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
                for (int i = 1; i < (args.length - 3); i += 4) {
                    if (args[i + 2].equals("м")) {
                        try {
                            allPeople.set(Integer.parseInt(args[i]), Person.createMale(args[i + 1], simpleDateFormat.parse(args[i + 3])));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            allPeople.set(Integer.parseInt(args[i]), Person.createFemale(args[i + 1], simpleDateFormat.parse(args[i + 3])));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            }
            case "-d": synchronized (allPeople){ //-d id1 id2 id3 id4 ...
                for (int i = 1; i < args.length; i++) {
                    int index = Integer.parseInt(args[i]);
                    Person person = allPeople.get(index);
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                    allPeople.set(index, person);
                }
                break;
            }
            case "-i": synchronized (allPeople){ //-i id1 id2 id3 id4 ...
                for (int i = 1; i < args.length; i++) {
                    Person person = allPeople.get(Integer.parseInt(args[i]));
                    SimpleDateFormat anotherDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                    System.out.println(person.getName() + " " + sex + " " + anotherDateFormat.format(person.getBirthDate()));
                }
                break;
            }
        }
    }
}