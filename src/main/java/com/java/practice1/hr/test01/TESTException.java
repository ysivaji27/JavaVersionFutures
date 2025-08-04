package com.java.practice1.hr.test01;

import java.util.Scanner;

public class TESTException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
           int a = scanner.nextInt(); // This will throw an exception if input is not an integer
            int b = scanner.nextInt();
            int quotient = a / b;
            int remainder = a % b;
            System.out.println("Quotient: " + quotient + " Remainder: " + remainder);
            System.out.println("Result: " + (a/ b)); // This will throw an exception if y is zero
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
