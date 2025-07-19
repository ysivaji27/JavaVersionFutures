package com.java.practice.hr.test01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Result1 {
    static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int i = 0;

        while (i < c.size() - 1) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                i += 2;
            } else {
                i += 1;
            }
            jumps++;
        }

        return jumps;
    }
}
public class JumpClouds {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cTemp[i]);
            c.add(cItem);
        }

        int result = Result1.jumpingOnClouds(c);
        System.out.println(result);
    }
}
