package com.java.practice1.June.test11;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'maxInversions' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static long maxInversions(List<Integer> arr) {
        // Write your code here
        int invLength = 3;
        int numOfInversion =0 ;
        if(arr.size()<3) return 0;
        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i < arr.size();i++){
            for(int j =i ; j < arr.size() && list.size()<3;j++){
                if ( i ==j ){
                    list.add(arr.get(j));
                }else if(arr.get(j) < list.get(list.size()-1)){
                    list.add(arr.get(j));
                }
            }
            if(list.size() == invLength){
                if(list.get(0) > list.get(1) && list.get(1) > list.get(2)){
                    numOfInversion++;
                }
            }
            list = new ArrayList<>();
        }

        return numOfInversion;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.maxInversions(arr);

        System.out.println(String.valueOf(result));

    }
}