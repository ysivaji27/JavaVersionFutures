package com.java.practice1.June.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountDivisors {
    public static void main(String args[]) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputValues = br.readLine().split(" ");                // Reading input from STDIN
        int count = 0;
        for (int i = Integer.parseInt(inputValues[0]); i < Integer.parseInt(inputValues[1]); i++) {
            if (i % Integer.parseInt(inputValues[2]) == 0)
                count++;
        }
        System.out.println(count);
        int testCount = (int) Arrays.stream(inputValues)
                .mapToInt(Integer::parseInt)
                .filter(value -> value % Integer.parseInt(inputValues[2]) == 0)
                .count();
        System.out.println(testCount);
    }
}
