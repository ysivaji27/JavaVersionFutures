package com.java.practice.June.day9;

import com.java.practice.June.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class TestPatterns {
    public static void main(String[] args) {
        testPattern();
        testMap();

    }

    public static void testPattern() {
        //12X345-67
        String input = "12X345-67";
        String pattern = "\\d{2}[X]\\d{3}-\\d{2}";
        Pattern regexPattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regexPattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Pattern matched: " + matcher.find());
        } else {
            System.out.println("Pattern not matched");
        }
    }

    public static void testMap() {

        List<Employee> employees = List.of(
                new Employee(1, "John Doe"),
                new Employee(1, "John Doe "),
                new Employee(2, "Jane Smith"),
                new Employee(3, "Alice Johnson"),
                new Employee(1, "Alice Johnson")
        );

        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName,
                        (old, newValue) -> old

                ));
        System.out.println(employeeMap);
    }
}
