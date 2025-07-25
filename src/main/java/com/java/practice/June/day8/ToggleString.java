package com.java.practice.June.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleString {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        name.chars().forEach(c -> {
            if (Character.isLowerCase(c)) {
                System.out.print((char)Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                System.out.print((char)Character.toLowerCase(c));
            } else {
                System.out.print(c);
            }
        });

        char[] charArray = name.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLowerCase(charArray[i])){
                System.out.print(Character.toUpperCase(charArray[i]));
            }else{
                System.out.print(Character.toLowerCase(charArray[i]));
            }

        }

    }
}
