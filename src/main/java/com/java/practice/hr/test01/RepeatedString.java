package com.java.practice.hr.test01;

import java.io.*;

class Result2 {
    public static long repeatedString(String s, long n) {
        // Write your code here
        char c = 'a';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        long  quotient = n / s.length();
        long  reminder = n % s.length();
        long  totalCount = quotient*count ;
        for (int i = 0; i < reminder ; i++) {
            if (s.charAt(i) == c) {
                totalCount++;
            }
        }
        return totalCount;
    }
}

public class RepeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        long n = Long.parseLong(bufferedReader.readLine().trim());
        long result = Result2.repeatedString(s, n);
        System.out.println(result);
    }
}
// 3 - 2
// 9 - (9/3)*2 = 6