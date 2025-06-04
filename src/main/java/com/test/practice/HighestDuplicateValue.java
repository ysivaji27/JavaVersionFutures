package com.test.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestDuplicateValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple1");
        map.put(2, "banana1");
        map.put(3, "apple2");
        map.put(4, "orange");
        map.put(5, "banana");
        map.put(6, "apple");

        // Count frequency of each value
        Map<String, Long> valueCounts = map.values().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the value with the highest frequency
        Optional<Map.Entry<String, Long>> mostFrequent = valueCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        // Print the result
        mostFrequent.ifPresent(entry ->
                System.out.println("Most frequent value: " + entry.getKey() + " -> " + entry.getValue()));
    }
}
