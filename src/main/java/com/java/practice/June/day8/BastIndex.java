package com.java.practice.June.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class BastIndex {

    // Function to calculate the valid group size based on remaining elements
    public static int getValidGroupSize(int remainingElements) {
        double factor = (Math.sqrt(1 + 8 * remainingElements) - 1) / 2;
        int n = (int) factor;
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array
        int n = Integer.parseInt(br.readLine());

        // Read the array elements
        String[] input = br.readLine().trim().split(" ");
        long[] arr = new long[n]; // Use long to handle large numbers

        for (int i = 0; i < n; i++) {
            if (!input[i].isEmpty()) {
                arr[i] = Long.parseLong(input[i]); // Use Long.parseLong for large numbers
            }
        }

        // Cumulative sum array
        long[] xsum = new long[n + 1];
        xsum[0] = 0;
        for (int i = 0; i < n; i++) {
            xsum[i + 1] = xsum[i] + arr[i];
        }

        // Initialize maximum with the last element of the array
        long maximum = arr[n - 1];

        // Calculate the special sum for each index
        for (int i = 0; i < n; i++) {
            int remainingElements = n - i;
            int groupSize = getValidGroupSize(remainingElements);
            long specialSum = xsum[i + groupSize] - xsum[i];

            // Update the maximum special sum
            if (specialSum > maximum) {
                maximum = specialSum;
            }
        }

        // Output the maximum special sum
        System.out.println(maximum);
    }
}