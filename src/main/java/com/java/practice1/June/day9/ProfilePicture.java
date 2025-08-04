package com.java.practice1.June.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProfilePicture {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            String[] dimensions = br.readLine().split(" ");
            if (Integer.parseInt(dimensions[0]) < length || Integer.parseInt(dimensions[1]) < length) {
                System.out.println("UPLOAD ANOTHER");
            } else if (Integer.parseInt(dimensions[0]) == length && Integer.parseInt(dimensions[1]) == length) {
                System.out.println("ACCEPTED");
            } else if (Integer.parseInt(dimensions[0]) > length || Integer.parseInt(dimensions[1]) > length) {
                if( Integer.parseInt(dimensions[0]) == Integer.parseInt(dimensions[1])) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }

        }

    }
}
