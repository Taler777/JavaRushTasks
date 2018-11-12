package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    //1. Класс Solution должен содержать public static поле allPeople типа List<Person>.
    public static List<Person> allPeople = new ArrayList<>();

    //2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if (args[0].equals("-c")) { //-c name sex bd
            Person person = null;
            if (args[2].equals("м")) {
                try {
                    person = Person.createMale(args[1], simpleDateFormat.parse(args[3]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else if (args[2].equals("ж")) {
                try {
                    person = Person.createFemale(args[1], simpleDateFormat.parse(args[3]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            allPeople.add(person);
            System.out.println(allPeople.size() - 1);

        } else if (args[0].equals("-u")) { //-u id name sex bd
            if (args[3].equals("м")) {
                try {
                    allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], simpleDateFormat.parse(args[4])));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], simpleDateFormat.parse(args[4])));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

        } else if (args[0].equals("-d")) { //-d id
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
            allPeople.set(index, person);
        } else if (args[0].equals("-i")) { //-i id
//-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
            Person person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat anotherDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";

            System.out.println(person.getName() + " " + sex + " " + anotherDateFormat.format(person.getBirthDate()));
        }
    }
}
