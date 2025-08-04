package com.java.practice1.June.exception;

public class TESTRunTimeException {
    public static void main(String[] args) {
        TESTRunTimeException testRunTimeException = new TESTRunTimeException();
        try {
            testRunTimeException.setAge(-5);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new InvalidInputException("Age cannot be negative");
        }
    }

}
