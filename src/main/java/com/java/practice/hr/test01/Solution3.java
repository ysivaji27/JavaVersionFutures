package com.java.practice.hr.test01;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution3 {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

      String message = sc.nextLine();
      Stack<Character> stack = new Stack<>();
       char[] chars =  message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '{' || chars[i] == '(' || chars[i] == '[') {
                stack.push(chars[i]);
            } else if (chars[i] == '}' || chars[i] == ')' || chars[i] == ']') {
                if (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (   (chars[i] == '}' && top != '{') ||
                            (chars[i] == ')' && top != '(') ||
                            (chars[i] == ']' && top != '[')   ) {
                       return;
                    }else{
                        stack.push(top);
                    }
                }else{
                    stack.push(chars[i]);
                }

            }
        }
         if(stack.isEmpty()){
             System.out.println("true");
         }else {
             System.out.println("false");
         }

    }
}
