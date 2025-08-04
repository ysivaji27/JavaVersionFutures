package com.java.practice1.lc.practice;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "bab";
        System.out.println("Longest Palindrome: " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int maxLength = 0;
        String subStr = "";
        int length = s.length();
        if (s.length() == 1) {
            return s;
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String sub = s.substring(i, j);
                if (sub.length() > maxLength) {
                    reverse.append(sub).reverse();
                    if (sub.contentEquals(reverse)) {
                        subStr = sub;
                        maxLength = sub.length();
                    }
                }
                reverse.setLength(0);
            }
        }
        return subStr;
    }
}

// bb - substring(0, 1)  - b
// bb - substring(0, 2)  - bb