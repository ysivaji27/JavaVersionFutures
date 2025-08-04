package com.java.practice1.June.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Divisibility {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());                // Reading input from STDIN
        List<String> integersList = Arrays.asList(br.readLine().split("\\s+"));

        StringBuilder finalString =  new StringBuilder();
        for (String integerValue  : integersList) {
           String test =  integerValue.substring(integerValue.length() - 1, integerValue.length());

            finalString.append(test);
        }
        System.out.println(finalString);
        if (!finalString.toString().endsWith("0")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

 //       5
 //       123 321 111 444 555
 //       31145 - last digit from each number
