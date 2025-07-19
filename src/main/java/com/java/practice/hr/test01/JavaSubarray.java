package com.java.practice.hr.test01;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String[] arrStr = sc.nextLine().split("\\s+");
        int[] arr = new int[arrStr.length];
        for(int i =0;i<arrStr.length;i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        int count= 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println("Number of negative subarrays: " + count);
    }
}

// This code reads an integer array from input, calculates the number of negative subarrays,
// and prints the count. It uses a nested loop to generate all possible subarrays,
// summing their elements and checking if the sum is negative. The count of such subarrays is maintained
// and printed at the end. The time complexity is O(n^2) due to the nested loops, which is acceptable for small input sizes.
// Note: The code assumes that the input is well-formed and does not handle exceptions or invalid inputs.
// The input format is expected to be the size of the array followed by the elements of the array separated by spaces.
// Example Input:
// 5
// -1 2 -3 4 -5
// Example Output:
// Number of negative subarrays: 9
