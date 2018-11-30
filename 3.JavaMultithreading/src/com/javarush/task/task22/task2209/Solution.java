package com.javarush.task.task22.task2209;

import java.io.*;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
        StringBuilder sbWords = new StringBuilder();
        while (in.ready()) {
            sbWords.append(in.readLine());
        }
        String[] array = sbWords.toString().split(" ");
        StringBuilder result = getLine(array);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = null;
        StringBuilder usedWords = null;
        String startChar = "";
        String endChar = "";
        if (words.length == 0) {
            return new StringBuilder();
        } else {
            int nextIndex = 0;
            do {
                sb = new StringBuilder();
                usedWords = new StringBuilder();
                String nextWord = words[nextIndex];
                for (int i = 0; i < words.length; i++) {
                    if (usedWords.indexOf(nextWord) >= 0) {
                        continue;
                    }

                    for (int j = 0; j < words.length; j++) {
                        if (nextWord.equals(words[j])) continue;
                        if (usedWords.indexOf(words[j]) >= 0) {
                            continue;
                        }
                        endChar = nextWord.substring(nextWord.length() - 1).toLowerCase();
                        startChar = words[j].substring(0, 1).toLowerCase();
                        if (startChar.equals(endChar)) {
                            if (sb.length() == 0) sb.append(nextWord + " ");
                            sb.append(words[j] + " ");
                            usedWords.append(nextWord + " ");
                            nextWord = words[j];
                            break;
                        }
                    }
                }
            } while (sb.toString().split(" ").length < words.length && ++nextIndex < words.length);
        }

        return new StringBuilder(sb.toString().trim());
    }
}
