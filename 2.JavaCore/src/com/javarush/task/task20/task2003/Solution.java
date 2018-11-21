package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream in = new FileInputStream(fileName);
        load(in);
        reader.close();
        in.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties properties = new Properties();
        for (Map.Entry<String, String> pair : Solution.properties.entrySet()) {
            properties.setProperty(pair.getKey(), pair.getValue());
        }
        properties.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        InputStreamReader isr = new InputStreamReader(inputStream, "UTF8");
        Properties properties = new Properties();
        properties.load(isr);
//        for (final String name : properties.stringPropertyNames())
//            Solution.properties.put(name, properties.getProperty(name));
        Solution.properties.putAll((Map) properties); // вместо обхода коллекции
    }

    public static void main(String[] args) {
    }
}
