package com.java.practice.June.day4;

import java.util.*;

public class AnagramGrouper {
    public static void main(String[] args) {
        String[] words = { "PAT", "TAP", "STUDENT", "STUDENTS", "LAMP", "LENS" };

        Map<String, List<String>> groupedWords = new HashMap<>();


        for (String word : words) {
            // Normalize word: sort characters
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add to group
            groupedWords.computeIfAbsent(key, k -> new ArrayList<>()).add(word);

        }


        // Print the groups
        for (List<String> group : groupedWords.values()) {
            if (group.size() > 1) {
                System.out.println(group);
            }
        }
    }
}
