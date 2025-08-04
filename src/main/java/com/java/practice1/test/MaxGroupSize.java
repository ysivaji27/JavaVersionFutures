package com.java.practice1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxGroupSize {
    public static int findMaxGroupSize1(int[] engagementScores) {
        if (engagementScores == null || engagementScores.length == 0)
            return 0;
        Arrays.sort(engagementScores);
        int maxSize = 0;
        int currentSize = 0;
        for (int i = 1; i < engagementScores.length; i++) {
            int diff = engagementScores[i] - engagementScores[i - 1];
            if (diff == 0 || diff == 1) {
                currentSize++;
            } else {
                if (currentSize > maxSize)
                    maxSize = currentSize;
                currentSize = 0;
            }
        }
        // Check at the end in case the largest group ends at the last element
        if (currentSize > maxSize)
            maxSize = currentSize;
        return maxSize;
    }

    public static int findMaxGroupSize(int[] engagementScores) {

        if (engagementScores == null || engagementScores.length == 0)
            return 0;

        Arrays.sort(engagementScores);
        int maxSize = 0;
        List<Integer> groupSizes = new ArrayList<>();
        for (int i = 1; i < engagementScores.length; i++) {
            int diff = engagementScores[i] - engagementScores[i - 1];
            if (diff <= 1) {
                maxSize++;
            } else {
                groupSizes.add(maxSize);
                maxSize = 0;
            }
        }
        if(maxSize>0 && groupSizes.isEmpty()) groupSizes.add(maxSize);
        // Check at the end in case the largest group ends at the last element

        return Collections.max(groupSizes);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,13};
        System.out.println("Max group size: " + findMaxGroupSize1(arr));

        List<Integer> list = Arrays.stream(arr).boxed().toList();
        int sum = list.stream().reduce(0,Integer::sum);
        System.out.println("Sum of engagement scores: " + sum);
    }
}
