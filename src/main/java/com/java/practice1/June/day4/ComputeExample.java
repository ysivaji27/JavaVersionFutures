package com.java.practice1.June.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeExample {
    public static void main(String[] args) {
        computeIExample();
        computeIfPresentExample();
        computeIfAbsentExample();
    }
    private static void computeIExample() {
        System.out.println("computeIExample");
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);

        // Recomputes value for key "apple"
        map.compute("apple", (key, val) -> val + 1); // val is 2
        // Adds new key if not present
        map.compute("banana", (key, val) -> (val == null ? 1 : val + 1)); // val is null

        System.out.println(map); // {apple=5, banana=1}
    }


    private static void computeIfPresentExample() {
        System.out.println("computeIfPresentExample");
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 2);

        // Only modifies "apple" because it is present
        map.computeIfPresent("apple", (key, val) -> val * 10); // 2 * 10 = 20

        // "banana" is not present, so nothing happens
        map.computeIfPresent("banana", (key, val) -> val + 1);

        System.out.println(map); // {apple=20}
    }

    private static void computeIfAbsentExample() {
        System.out.println("computeIfAbsentExample");
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);

        // "apple" is already present, so value is not changed
        map.computeIfAbsent("apple", key -> 100);

        // "banana" is not present, so it will be added
        map.computeIfAbsent("banana", key -> 50);

        Map<String, List<String>> groupedWords = new HashMap<>();
        groupedWords.computeIfAbsent("banana",key-> new ArrayList<>()).add("100");

        System.out.println(map); // {apple=5, banana=50}
    }

    private static void computeIfAbsentExample2() {
        System.out.println("computeIfAbsentExample");
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);

        // "apple" is already present, so value is not changed
        map.computeIfAbsent("apple", key -> 100);

        // "banana" is not present, so it will be added
        map.computeIfAbsent("banana", key -> 50);

        Map<String, Integer> groupedWords = new HashMap<>();
        groupedWords.computeIfAbsent("banana", key -> 10);

        System.out.println(map); // {apple=5, banana=50}
    }
}

