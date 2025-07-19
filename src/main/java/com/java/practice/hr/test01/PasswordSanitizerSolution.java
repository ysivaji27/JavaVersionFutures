package com.java.practice.hr.test01;

import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;

class PasswordSanitizer{

    public String filter(List<String> passwords){
        List<String> validPasswords = new ArrayList<>();

        for(String password : passwords){
            if(password.length()>=5){
                char[] chars = password.toCharArray();
                boolean ischar = false;
                boolean isNum = false;
                boolean isWhitespace = false;
                boolean isValid = false;
                for (Character c : chars) {
                    if(Character.isLetter(c)) ischar = true;
                    if(Character.isDigit(c)) isNum = true;
                    if (Character.isWhitespace(c)) isWhitespace = true;

                    if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')){
                        isValid = true;
                    }
                }
                if(isValid){
                    validPasswords.add(password);
                }

            }
        }
        return String.join(" ", validPasswords);



    }
}

public class PasswordSanitizerSolution {
    public static void main(String args[] ) throws Exception {
        //reader and writer
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] passwords = bufferedReader.readLine().split(" ");

        PasswordSanitizer ps = new PasswordSanitizer();

        String output = ps.filter(Arrays.asList(passwords));

        bufferedWriter.write(output);
        bufferedWriter.newLine();;

        bufferedReader.close();
        bufferedWriter.close();
    }
}