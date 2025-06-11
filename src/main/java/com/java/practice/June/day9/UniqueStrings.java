package com.java.practice.June.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class UniqueStrings {
    public static void main(String[] args) {


        String input = "java is a programming language java is a programming language test test";

        List<String> uniqueValues =  Arrays.stream(input.split(" ")).map(String::toLowerCase).distinct().toList();
        Set<String> uniqueValuesSet =  Arrays.stream(input.split(" ")).map(String::toLowerCase).collect(Collectors.toSet());

        System.out.println(uniqueValues + " Set " + uniqueValuesSet);

        int[] arr = {1, 2, 3, 2, 1, 4, 5, 5, 4};
        int single_student_number = 0;
        for (int num : arr) {
            single_student_number ^= num;
        }
        System.out.println("Single student number: " + single_student_number);
    }

}
