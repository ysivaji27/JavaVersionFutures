package com.test.cg;

import java.util.List;
import java.util.Set;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);

        circle.display();
        rectangle.display();
        square.display();

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of numbers: " + sum);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        //.toList();
        System.out.println("Even numbers: " + evenNumbers);

        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        randomGenerator.ints(5, 1, 100) // 5 random ints between 1 (inclusive) and 100 (exclusive)
                .forEach(System.out::println);
    }
}
