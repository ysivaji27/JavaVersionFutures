package com.java.practice.hr.test01;

public class FindChars {
    public static void main(String[] args) {
        // find character a from string
         String s = "gfcaaaecbg";
        char c = 'a';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("Character '" + c + "' found " + count + " times in the string \"" + s + "\".");
        double repeatCount = 547602L;
        long   totalCount = (long)Math.ceil((repeatCount/s.length())*count) ;
        System.out.println("Total count of character '" + c + "' in the repeated string: " + totalCount);
    }
}
