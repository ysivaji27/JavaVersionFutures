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


        Map<Integer, List<String>> mapList = new HashMap<>();
        List<String> list1 = Arrays.asList("apple", "banana1", "apple2");
        List<String> list2 = Arrays.asList("orange", "banana", "apple");
        mapList.put(1, list1);
        mapList.put(2, list2);

        // Count frequency of each value in the mapList
        Map<String, Long> listValueCounts = mapList.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the value with the highest frequency in the mapList
        Optional<Map.Entry<String, Long>> mostFrequentList = listValueCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        EmpData empData1 = new EmpData();
        // Print the result for mapList
        empData1.setEmpId(1);
        empData1.setAddressList(Arrays.asList("123 Main St", "456 Elm St"));

        EmpData empData2 = new EmpData();
        empData2.setEmpId(2);
        empData2.setAddressList(Arrays.asList("789 Oak St", "123 Main St"));

        Map<Integer, EmpData> empDataMap = new HashMap<>();
        empDataMap.put(1, empData1);
        empDataMap.put(2, empData2);

        empDataMap.values().stream().flatMap(
                        empData -> empData.getAddressList().stream()
                ).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Most frequent address: " + entry.getKey() + " -> " + entry.getValue()));

    }
}
