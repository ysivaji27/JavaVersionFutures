package com.java.practice.June.test11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PalindromeSplit {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  size =Integer.parseInt(br.readLine());
        Set<String> stringSet = new HashSet<>();
        for (int test = 0; test < size; test++) {
            char[] input = br.readLine().toCharArray();
            int i = 0;
            for (; i < input.length; i++) {
                String subString = String.valueOf(input[i]);
                for (int j = i+1; j < input.length; j++) {
                    subString += input[j];
                    if(subString.equals(new StringBuffer(subString).reverse().toString())) {
                        stringSet.add(subString);
                        subString ="";
                        break;
                    }
                }
            }
            System.out.println(stringSet.size());
        }
    }
}
