package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
        StringBuilder simpleWord = new StringBuilder();
        StringBuilder reverseSimpleWord = new StringBuilder();
        while (in.ready()) {
            simpleWord.append(in.readLine()).append(" ");
        }
        simpleWord.trimToSize();
        String[] words = simpleWord.toString().split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            String reverseWord = word.reverse().toString();
            for (int j = i + 1; j < words.length; j++) {
                if (reverseWord.equals(words[j])) {
                    if (reverseSimpleWord.indexOf(" " + reverseWord + " ") < 0) {
                        reverseSimpleWord.append(" " + reverseWord + " ");
                        Pair pair = new Pair();
                        pair.first = words[i];
                        pair.second = reverseWord;
                        result.add(pair);
                    } else continue;
                }
            }
        }

        for (Pair pair : result) {
            System.out.println(pair.first + " " + pair.second);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}
