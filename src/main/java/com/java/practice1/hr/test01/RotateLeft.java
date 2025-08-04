package com.java.practice1.hr.test01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class RotateLeft {

    public static List<Integer> rotateLeft(List<Integer> integerList, int d) {

        int[] intArr = integerList.stream().mapToInt(Integer::intValue).toArray();

        List<Integer> testArr = Arrays.stream(intArr)
                .mapToObj(Integer::valueOf)
                .toList();

        List<Integer> list2 = Arrays.stream(intArr).boxed().collect(toList());
        List<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(intArr).boxed().toArray(Integer[]::new)));

        for (int i = 0; i < d; i++) {
            int removedVal = list2.remove(0);
            list2.add(removedVal);
        }
        return list2;

    }

    public static List<Integer> rotateRight(List<Integer> integerList, int d) {

        for (int i = 0; i < d; i++) {
            int removedVal = integerList.remove(integerList.size() - 1);
            integerList.add(0, removedVal);
        }
        return integerList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> numList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        System.out.println(" before rotation: " + numList);

        List<Integer> list1 = rotateLeft(numList, d);
        System.out.println(" after rotation list1: " + list1);

        List<Integer> list2 = rotateRight(numList, d);
        System.out.println(" after rotation list2 : " + list2);


        bufferedReader.close();

    }
}
