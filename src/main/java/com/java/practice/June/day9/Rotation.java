package com.java.practice.June.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Rotation {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for(int i =0;i<size ; i++){
            String[] conditions =  br.readLine().split(" ");
            String[] conditionValues =  br.readLine().split(" ");
            LinkedList<String> llist = new LinkedList<>(Arrays.asList(conditionValues));

            for(int order=0;order<Integer.parseInt(conditions[1]);order++){
                llist.addFirst(llist.get(llist.size()-1));
                llist.removeLast();
            }
            llist.stream().collect(Collectors.joining(" ")).lines().forEach(System.out::println);

        }
    }
}
