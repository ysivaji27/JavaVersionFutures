package com.java.practice.June.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class SevenSegmentDisplay {

    public static void main(String[] args) throws IOException {
        display();
    }

    private static void display() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()) ;
        Map<Integer, Integer> segmentMap = Map.of(
                1, 2,
                2, 5,
                3, 5,
                4, 4,
                5, 5,
                6, 6,
                7, 3,
                8, 7,
                9, 6,
                0, 6);
        for (int i = 0; i <testCases ; i++) {
            char[] numbers = br.readLine().toCharArray() ;
            int segCount =0 ;
            for (int j = 0; j <numbers.length ; j++) {
                segCount += segmentMap.get(Character.getNumericValue(numbers[j]));
            }
            if(segCount%2 == 0) {
                int num =  segCount/2;
                for (int j = 0; j < num; j++) {
                    System.out.print(1);
                }
            }else {
                int num =segCount/2;
                System.out.print(7);
                for (int k = 0; k < num-1; k++) {
                    System.out.print(1);
                }
            }
            System.out.print("\n");
        }
    }
}
