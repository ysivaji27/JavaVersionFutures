package com.java.practice.June.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  number = Integer.parseInt(br.readLine()) ;
        factorial1(number);
        System.out.println("Factorial of " + number + " is: " + factorial2(number));
    }
    private  static void factorial1(int input) {
        // Reading input from STDIN
        int answer = 1;
        for(int i=2;i<=input;i++){
            answer = answer*i;
        }
        System.out.println(answer);
    }

    public static long factorial2(int n) {
        if (n <= 1) return 1;
        return n * factorial2(n - 1);
    }
}
