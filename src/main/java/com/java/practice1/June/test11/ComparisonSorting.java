package com.java.practice1.June.test11;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int  maxVal = Collections.max(arr)+1;
        int[] numbers = new int[maxVal];

        for(int i=0;i<arr.size();i++){
            int val =  arr.get(i);
            numbers[val] = numbers[val] +1 ;
        }
        return Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
              //.toList();
    }

}

public class ComparisonSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result3.countingSort(arr);

        System.out.println(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();

    }
}
