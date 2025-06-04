package com.test.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FavouriteSinger {
    public static void main(String[] args) throws Exception {

        unnamed();

    }

    private static void unnamed1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> singers = new HashMap<>();
        @SuppressWarnings("unused")
        String str = reader.readLine();
        String line = reader.readLine();


        Map<Character, Long> map = line.chars().mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        ArrayList<Long> songs = new ArrayList<>(map.values());
        if (!songs.isEmpty()) {
            Long max = Collections.max(songs);
            int freq = Collections.frequency(songs, max);
            System.out.println(freq);
        }

    }

    private  static void unnamed() throws IOException {

        /* Sample code to perform I/O:
         * Use either of these methods for input
         */
        //BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String line = reader.readLine();

        Map<String,Long> favouriteSingersMap = Arrays.stream(line.trim().split("\\s+"))
                .limit(count)
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                );

        ArrayList<Long> songs = new ArrayList<>(favouriteSingersMap.values());

        if(!songs.isEmpty()){
            Long max = Collections.max(songs);
            int freq = Collections.frequency(songs,max);
            System.out.println(freq+ " max " + max+"  freq"+freq);
        }

    }

}