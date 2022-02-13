// Team Gnocchi -- Hugo Jenkins (Boary), Ryan Lau (Jon), and Brian Kang (Vivian)
// APCS pd6
// L06 -- Read/Review/Expand
// 2022-02-11f
// time spent: .5hrs

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;


public class Activity5 {
    private static final String SPACE = " ";

    public static String removePunctuation(String word) {
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
            word = word.substring(1);
        }
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
            word = word.substring(0, word.length() - 1);
        }

        return word;
    }


    public static String getMostCommonWord(String fileName) {
        HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();

        String text = textToString(fileName);

        String mostCommonWord = text.split(SPACE)[0];
        // this line is needed so that line 49 doesn't return a java.lang.NullPointerException
        wordCounts.put(text.split(SPACE)[0], 0);

        for (String word : text.split(SPACE)) {
            word = removePunctuation(word);
            word = word.toLowerCase();

            if (wordCounts.get(word) == null) {
                wordCounts.put(word, 1);
            } else {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }

            // check if this word is now the most common word
            if (wordCounts.get(word) > wordCounts.get(mostCommonWord)) {
                mostCommonWord = word;
            }
        }

        return mostCommonWord;

    }

    public static void main(String[] args) {
        System.out.println(getMostCommonWord("GreatGatsby.txt"));
    }

    public static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            // add 'words' in the file to the string, separated by a single space
            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }
        // make sure to remove any additional space that may have been added at the end
        // of the string.
        return temp.trim();
    }

}
