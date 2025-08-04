package com.java.practice1.June.test11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BFromA {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i <testCases ; i++) {
            int   charCount=0, count=0;
            String[] integers = br.readLine().split("\\s+");
            String line1 = br.readLine().trim();
            String line2 = br.readLine().trim();
            if(line1.length() < line2.length()) {
                count  =0;
            }else{
            char[] line1Chars = line1.toCharArray();
                for (int j = 0; j < line1Chars.length; j++) {
                    if(line2.contains(""+line1Chars[j])) {
                        charCount++;
                        if(charCount== line2.length()) {
                            count ++;
                            charCount=0;
                        }

                    }
                }
            }
            System.out.println(count);
        }

    }
}

