package com.java.practice1.June.test11;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result6 {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */
    public static int pairs(int k, List<Integer> arr1) {
        // Write your code here
        int count = 0;
        //Collections.sort(arr);
        List<Integer> arr = arr1.stream().distinct().collect(Collectors.toList());
        System.out.println(arr.size() + " arr1 size: " + arr1.size());
        int length = arr.size();
        for(int i=0;i<length-1;i++){
            for(int j =i+1;j<length;j++){
                int val = Math.abs(arr.get(i)-arr.get(j));
                if(val==k) count++;
            }
        }
        return count;
    }
}

public class NumberOfPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result6.pairs(k, arr);

       System.out.println(String.valueOf(result));


        bufferedReader.close();

    }
}
