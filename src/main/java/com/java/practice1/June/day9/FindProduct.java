package com.java.practice1.June.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindProduct {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        double answer =1 ;
        String[] input = "1 2 3 4 5".split(" ");
        for (int index = 0; index < size; index++) {
            answer  = (answer * Long.parseLong(input[index])) % (Math.pow(10, 9) + 7);

        }
        System.out.println((int)answer);

    }
}
