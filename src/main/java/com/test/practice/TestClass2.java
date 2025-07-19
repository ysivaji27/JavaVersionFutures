package com.test.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class TestClass2
{
    public static void main(String[] args) {
        strGroups();
    }
    public static void  test() throws IOException {
            //BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numberOfTests = Integer.parseInt(br.readLine());
            for(int i = 0; i < numberOfTests; i++) {
                String[] rowsAndColumns  = br.readLine().trim().split("\\s+");
                int rows  = Integer.parseInt(rowsAndColumns[0]);
                int columns  = Integer.parseInt(rowsAndColumns[1]);
                int maxBorder = 0;
                for(int j = 0; j < rows; j++) {
                    String line = br.readLine().trim();
                    // int border = maxBlackCells(line,columns);
                    int  border = line.chars().mapToObj(c->(char)c).limit(columns) .filter(c->c =='#').toList().size();
                    maxBorder = (maxBorder < border) ? border : maxBorder;
                }
                System.out.println(maxBorder);
            }

        }
    public static int maxBlackCells(String line,int columns){
        int count = 0;
        for(int i=0;i<columns;i++){
            if(line.charAt(i) == '#'){
                count++;
            }
        }
        return count;
    }

    private static void strGroups(){
        // PAT TAP STUDENT STUDENTS LAMP LENS
       List<String> words = Arrays.asList("PAT", "TAP", "STUDENT", "STUDENTS", "LAMP", "LENS");

        Map<String, List<String>> groupedWords = new HashMap<>();

        for (String word : words) {
            String key =  word.chars().peek(System.out::println).mapToObj(c-> (char) c).peek(System.out::println)
                    .sorted()
                    .distinct()
                    .filter(c-> c != ' ' && c != '\n')
                    .map(String::valueOf)
                    .collect(Collectors.joining());
            groupedWords.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
       }
        // Print the groups
        for (List<String> group : groupedWords.values()) {
                System.out.println(group);
        }

        List<String> stringList = List.of("LENS", "TAP", "STUDENT", "STUDENT", "TAP", "LENS");
        System.out.println("Distinct elements in the list:");
        stringList.stream().distinct().forEach(s-> { System.out.println(s); });

    }
}

