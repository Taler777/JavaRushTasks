package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader file1Reader = new BufferedReader(new FileReader(file1));
        BufferedReader file2Reader = new BufferedReader(new FileReader(file2));

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        while (file1Reader.ready()) list1.add(file1Reader.readLine());
        while (file2Reader.ready()) list2.add(file2Reader.readLine());

        while ((list1.size() > 0) && (list2.size() > 0)) {
            if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else {
                if (list1.get(0).equals(list2.get(1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(0)));
                    lines.add(new LineItem(Type.SAME, list1.get(0)));
                    list2.remove(1);
                    list2.remove(0);
                    list1.remove(0);
                } else {
                    if (list1.get(1).equals(list2.get(0))) {
                        lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                        lines.add(new LineItem(Type.SAME, list1.get(1)));
                        list1.remove(1);
                        list1.remove(0);
                        list2.remove(0);
                    }
                }
            }
        }
        if (list1.size() > 0) {
            lines.add(new LineItem(Type.REMOVED, list1.get(0)));
            list1.remove(0);
        } else {
            lines.add(new LineItem(Type.ADDED, list2.get(0)));
            list2.remove(0);
        }
        file1Reader.close();
        file2Reader.close();
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}