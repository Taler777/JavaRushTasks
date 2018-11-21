package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));
        // My code
        try {
            File file = File.createTempFile("your_file_name", null);
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            Solution savedObject = new Solution(11);
            outputStream.writeObject(savedObject);
            outputStream.flush();
            outputStream.close();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            Solution otherObject = new Solution(22);
            Solution loadedObject = (Solution) inputStream.readObject();
            inputStream.close();
            System.out.println(savedObject.string.equals(loadedObject.string));
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
