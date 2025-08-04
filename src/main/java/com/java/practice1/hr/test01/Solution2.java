package com.java.practice1.hr.test01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        List<String> test = new ArrayList<>();
        test.add(s1);
        test.add(s2);
        test.add(s3);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String[] teststr = test.get(i).split(" ");
            System.out.println(padRight(teststr[0], 15) + String.format("%03d", Integer.parseInt(teststr[1].trim())));
        }
        System.out.println("================================");
        String[]  weekdays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        Date date =  new Date();
        LocalDate localDate = LocalDate.of(1982,8,28);
        System.out.println( localDate.getDayOfWeek());

    }

    public static String padRight(String s, int n) {
        return String.format("%-15s", s);
    }

}
