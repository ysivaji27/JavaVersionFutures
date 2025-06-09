package com.java.practice.June.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BruteForce {
    public static void main(String[] args)throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        while(!name.equals("42")){
            System.out.println(name);
            name = br.readLine();
        }
    }
}
