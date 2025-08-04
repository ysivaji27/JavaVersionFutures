package com.java.practice1.June.exception;

import java.util.LinkedList;

public class TESTException {
    int balance = 500;
    public static void main(String[] args) {
        TESTException  testException = new TESTException();
        try {
            testException.withdraw(1000);
            testException.setAge(-5);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        LinkedList<Integer> numberLinkedList = new LinkedList<>();
        numberLinkedList.addFirst(1);
        numberLinkedList.addLast(2);
        numberLinkedList.set(0,10);
        numberLinkedList.add(1,10);

       // List<Integer> numberLinkedList2 = new LinkedList<>();
     //   numberLinkedList2.addFirst(1);
       // numberLinkedList2.addLast(2);
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough funds!");
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new InvalidInputException("Age cannot be negative");
        }
    }

}
