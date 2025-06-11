package com.java.practice.June.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FavouriteSinger {
    public static void main(String args[] ) throws Exception {
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
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );

        ArrayList<Long> songs = new ArrayList<>(favouriteSingersMap.values());

        if(!songs.isEmpty()){
            Long max = Collections.max(songs);
            int freq = Collections.frequency(songs,max);
            System.out.println(freq);
        }
        // Write your code here

    }
}
