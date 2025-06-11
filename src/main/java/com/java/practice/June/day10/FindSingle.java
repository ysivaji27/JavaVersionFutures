package com.java.practice.June.day10;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSingle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 5, 4};
        int single_student_number = 0;
        for (int num : arr) {
            single_student_number ^= num;
        }
        System.out.println("Single student number: " + single_student_number);

        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().filter(entry -> entry.getValue() == 1).forEach(entry-> {
            System.out.println(entry.getKey());
        });

    }
}
