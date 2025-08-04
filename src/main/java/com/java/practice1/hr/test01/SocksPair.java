package com.java.practice1.hr.test01;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Map<Integer,Long> map = ar.stream().collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting())
        );
        long count =0 ;
        for(Integer num:map.keySet()){
            count += map.get(num)/2;
        }
        return (int)count;
    }

}

public class SocksPair {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);
        System.out.println(result);
    }
}
