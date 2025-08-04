package com.java.practice1.June.test11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HiddenTreasure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 34071; // Integer.parseInt(br.readLine().trim());
        String[] arr_nums = br.readLine().split(" ");
        int[] nums = Arrays.stream(arr_nums).mapToInt(Integer::parseInt).toArray();

        System.out.println(solve(n, nums));
        br.close();
    }

    static long solve(int n, int[] nums) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        for (int num : nums) {
            int digitSum = String.valueOf(num).chars().map(Character::getNumericValue).sum();
            sumCount.put(digitSum, sumCount.getOrDefault(digitSum, 0) + 1);
        }
        long result = 0;
        for (int count : sumCount.values()) {
            if (count > 1) {
                long res = 1;
                for (int i = 1; i <= 2; i++) {
                    res = res * (count - i + 1) / i;
                }
                result += res;
            }
        }
        return result;
    }
}