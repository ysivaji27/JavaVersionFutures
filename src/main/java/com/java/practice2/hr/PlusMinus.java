package com.java.practice2.hr;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        long pCount = arr.stream().filter(x -> x > 0).count();
        long nCount = arr.stream().filter(x -> x < 0).count();
        long zCount = size - pCount - nCount;

        String result =  String.format("%1$.6f%n%2$.6f%n%3$.6f", (double) pCount / size, (double) nCount / size, (double) zCount / size );
        System.out.print(result);

        Object[] ccount = arr.stream().filter(x -> x > 0).toArray();

        Map<String , String > map = Map.of("key1", "value1", "key2", "value2");
        map.forEach((k,v) -> System.out.println(k + " : " + v));

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        int sum = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        integerList.forEach(v-> System.out.print(v + " "));
        integerList .forEach(s->{ System.out.println(s); });

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Result.plusMinus(arr);
        bufferedReader.close();
    }

}
