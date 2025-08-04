package com.java.practice1.hr.test01;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result4  {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack<>();
        char[] chars =  s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '{' || chars[i] == '(' || chars[i] == '[') {
                stack.push(chars[i]);
            } else if (chars[i] == '}' || chars[i] == ')' || chars[i] == ']') {
                if (!stack.isEmpty()) {
                    char top =  stack.pop();
                    if(chars[i] == '}' && top == '{' ||
                            chars[i] == ')' && top == '(' ||
                            chars[i] == ']' && top == '[') {
                      // do nothing, valid pair found
                        System.out.println("Valid pair found: " + top + " and " + chars[i]);
                    }else{
                        stack.push(top);
                    }
                }else{
                    stack.push(chars[i]);
                }

            }
        }
        if(stack.isEmpty()){
            return "YES";
        }else {
            return "NO";
        }
    }
}

public class StackSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result4.isBalanced(s);

                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

    }
}


// Sample Input
// 3
// {[(])}
// {{[[(())]]}}
// {(([])[])[]}
// Sample Output
// NO
// YES
// YES
