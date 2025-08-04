package com.java.practice1.June.day9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BastIndex2 {


    public static void main(String[] args) throws IOException {
        int size = 6;
        String[] input = "-3 2 3 -4 3 1".split(" ");
        List<Integer> totalSumList = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            totalSumList.add(getSumOfSubArray(input, index));
        }

        System.out.println(totalSumList);
    }

    private static int getSumOfSubArray(String[] input, int index) {
        int sum = 0;
        int counter = 0;


        for (int k = 0; k < index; k++) {
            for (int i = 0; i <= k; i++) {
                counter++;
            }

        }
        try {
            int startIndex = 0;
            if(counter==0){
                sum += Integer.parseInt(input[counter+startIndex]);
            }else {
                while ( counter>=startIndex) {
                    sum += Integer.parseInt(input[counter+startIndex]);
                    startIndex++;
                }
            }


        } catch (Exception exception) {
            sum = 0;
        }
        return sum;
    }
}