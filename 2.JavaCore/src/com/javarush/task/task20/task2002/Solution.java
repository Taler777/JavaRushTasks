package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user0 = new User();
            user0.setFirstName("firstName0");
            user0.setLastName("secondName0");
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date birthday = sdf.parse("11 08 2000");
            user0.setBirthDate(birthday);
            user0.setMale(true);
            user0.setCountry(User.Country.RUSSIA);
            javaRush.users.add(0, user0);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            if (users != null) {
                outputStream.write(("haveUsers" + "\r\n").getBytes());
                outputStream.write(("" + users.size() + "\r\n").getBytes());
                for (User user : users) {
                    outputStream.write((user.getFirstName() + "\r\n").getBytes());
                    outputStream.write((user.getLastName() + "\r\n").getBytes());
                    outputStream.write(("" + String.valueOf(user.getBirthDate().getTime()) + "\r\n").getBytes());
                    outputStream.write((String.valueOf(user.isMale()) + "\r\n").getBytes());
                    outputStream.write((user.getCountry().getDisplayName() + "\r\n").getBytes());
                }
            } else outputStream.write("noUsers".getBytes());
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            if (reader.readLine().equals("haveUsers")) {
                int size = Integer.parseInt(reader.readLine());
                for (int i = 0; i < size; i++) {
                    User user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                    user.setMale(Boolean.valueOf(reader.readLine()));
                    String country = reader.readLine();
                    switch (country) {
                        case "Russia":
                            user.setCountry(User.Country.RUSSIA);
                            break;
                        case "Ukraine":
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "Other":
                            user.setCountry(User.Country.OTHER);
                            break;
                    }
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}