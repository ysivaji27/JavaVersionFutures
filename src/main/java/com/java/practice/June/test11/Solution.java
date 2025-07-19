package com.java.practice.June.test11;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int digitCount = 0, lowerCase= 0, upperCase =0,special =0;
        String splChars = "!@#$%^&*()-+";

        char[] letters = password.toCharArray();
        for(int i = 0;i<n; i++){
            if(Character.isDigit(letters[i]) && digitCount==0) digitCount++;
            if(Character.isLowerCase(letters[i]) && lowerCase==0 ) lowerCase++;
            if(Character.isUpperCase(letters[i]) && upperCase==0) upperCase++;
            if(splChars.contains(String.valueOf(letters[i])) && special==0) special++;
        }
        int rem =  4 - (digitCount+lowerCase+upperCase+special);

        if(rem+password.length()<6){
            return  6-password.length();
        }else{
            return rem;
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);
        System.out.println(answer);
    }
}
