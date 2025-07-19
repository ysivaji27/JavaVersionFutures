package com.test.version.changes;

import java.util.List;

public class java8samples {

    // LS DS -  FO MD
    // ----------------
    // Lambda Expressions
    // Stream API
    // Default Methods in the interface
    // Static Methods
    // Functional Interfaces
    // Optional
    // Method References
    // Date API

    public static void main(String[] args) {

        String name = "Java 8 Features";

        char[] nameChars = name.toCharArray();
        for (int i = 0; i < nameChars.length; i++) {
            if(Character.isLowerCase(nameChars[i])) {
                nameChars[i] = Character.toUpperCase(nameChars[i]);
            } else {
                nameChars[i] = Character.toLowerCase(nameChars[i]);
            }
        }
        for (char nameChar : nameChars) {
            System.out.print(nameChar);
        }

        System.out.println("");

        name.chars().forEach(c-> {
            if (Character.isLowerCase( c) ){
                System.out.print((char)Character.toUpperCase(c));
            }else{
                System.out.print((char)Character.toLowerCase(c));
            }
        });

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        int sum = intList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        List<Long> longList = List.of(1L, 2L, 3L, 4L, 5L);
        long longSum = longList.stream()
                .mapToLong(Long::longValue)
                .sum();

        System.out.println("Sum of integers: " + sum);

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        double doubleSum = doubleList.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

    }
}
