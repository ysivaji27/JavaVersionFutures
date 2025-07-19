package com.java.practice.June.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AliHelping {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        List<Integer> list = new ArrayList<>();
      //  list.removeFirst();

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();                // Reading input from STDIN
        String pattern = "\\d{2}[^AEIOUY]\\d{3}-\\d{2}";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);
        boolean flag = false;
        if (matcher.find()) {
            char[] numbers = input.toCharArray() ;
            int segCount =0 ;
            int counter = 0;
            for (int i= 0; i <numbers.length ;i++) {
                if(Character.isDigit(numbers[i])) {
                    segCount += Character.getNumericValue(numbers[i]);
                    counter++;
                    if(counter%2 == 0) {
                        if(segCount%2 == 0) {
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }else {
                        segCount = Character.getNumericValue(numbers[i]);
                    }
                }
            }
        } else {
            flag = false;
        }
        if (false){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
