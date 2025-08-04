package com.java.practice1.hr.test01;

import java.util.Stack;
import java.util.Scanner;

class MyQueue<T> {

    private Stack<T> in = new Stack<>();
    private Stack<T> out = new Stack<>();

    public void enqueue(T element) {
        out.push(element);
    }

    public void dequeue() {
        if (in.isEmpty()) {
            while (!out.isEmpty()) {
                in.push(out.pop());
            }
        }
        in.pop();
    }

    public T peek() {
        if (in.isEmpty()) {
            while (!out.isEmpty()) {
                in.push(out.pop());
            }
        }
        return in.peek();
    }
}

public class DequeSolution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}