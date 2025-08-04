package com.java.practice1.June.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ZOOOTEST {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN

        Map<Character,Long> map = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        if ((map.get('o') == map.get('z') * 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
