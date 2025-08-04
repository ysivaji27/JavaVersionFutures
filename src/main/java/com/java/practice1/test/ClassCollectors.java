package com.java.practice1.test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class    Person {
    String name;
    String address;
    Integer salary ;
    int grade;
    String department;
    public Person(String name, String address, Integer salary, int grade, String department) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getSalary() {
        return salary;
    }
    public int getGrade() {
        return grade;
    }
    public String getDepartment() {
        return department;
    }
}
public  class ClassCollectors {
    public static void main(String[] args) {
        Person person = new Person( "John Doe", "123 Main St",  12000, 60, "Engineering");
        Person person2 = new Person( "John Doe2", "124 Main St", 51000, 45, "Engineering");
        List<Person> people = List.of(person, person2);

        int PASS_THRESHOLD = 50;

        // Accumulate names into a List
        List<String> list = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        // Accumulate names into a TreeSet
        Set<String> set = people.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        // Convert elements to strings and concatenate them, separated by commas
        List<String> things = List.of("apple", "banana", "cherry");
        String joined = things.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        // Compute sum of salaries of employee
//        int total = people.stream()
//                .collect(Collectors.summingInt({}::getSalary));

        // Group employees by department
//        Map<Person, List<Employee>> byDept = people.stream()
//                .collect(Collectors.groupingBy(Person::getDepartment));
//
//        // Compute sum of salaries by department
//        Map<Person, Integer> totalByDept = people.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.summingInt(Person::getSalary)));

        // Partition students into passing and failing
        Map<Boolean, List<Person>> passingFailing = people.stream()
                .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));


        Integer x = 100;
        Integer y = 100;
        System.out.println(x == y); // true (cached)

        Integer m = 200;
        Integer n = 200;
        System.out.println(m == n); // false (not cached)


    }
}
