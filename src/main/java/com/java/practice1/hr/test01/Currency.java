package com.java.practice1.hr.test01;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + ch.format(payment));
        System.out.println("France: " + fr.format(payment));

        String message = "Hello, World.";
        String flag = "true";
       Map<Character,Long> messageMap =  message.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Character key : messageMap.keySet()) {
           if( messageMap.get(key)%2!=0){
               flag= "false";
               break;
           }
        }
        System.out.println(flag);


    }
}
// Sample Input:
// 12324.134
// Sample Output:
// US: $12,324.13
// India: ₹12,324.13
// China: ¥12,324.13
// France: 12 324,13 €
