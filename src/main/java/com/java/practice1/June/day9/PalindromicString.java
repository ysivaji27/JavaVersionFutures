package com.java.practice1.June.day9;

public class PalindromicString {
    public static void main(String[] args) {
        String input = "madam";

        String  reversedString = new StringBuilder(input).reverse().toString();
        if(reversedString.toString().equals(input)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        StringBuffer sb = new StringBuffer(input);
        String  reversedString2 =   sb.reverse().toString();
        if(reversedString2.equals(input)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
