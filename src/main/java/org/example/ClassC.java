package org.example;

import java.util.*;

public class ClassC {
    // Main Function
    public static void main(String args[]) {
        ClassA d1 = new ClassA();
        ClassB a1 = new ClassB();

        // Calls the unnamed() method of ClassA class
        d1.unnamed("");

        // Calls the unnamed() method of ClassB class
        a1.unnamed("");

        // Polymorphism: Animal reference pointing to ClassB object
        ClassA a2  = new ClassB();


        // Calls the unnamed() method of ClassB class
        a2.unnamed("");

        // To call the base class method, you need to use a Dog reference
        ((ClassA) a2).unnamed("");

        ClassB classB = new ClassB();
        System.out.println( classB.unnamedStatic(" TEST STATIC"));;

        List<String> stringList = new java.util.ArrayList<>();
        stringList.add("JavaScript");
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
      //  stringList.removeIf(java.util.function.Predicate.not(String::isBlank));
        System.out.println(stringList);

        Set<String> stringSet = new HashSet<>() Set.of("JavaScript", "Java", "Python", "C++");
        stringSet.stream()
                .filter(java.util.function.Predicate.not(String::isBlank))
                .forEach(System.out::println);

        // Example of using var in a lambda expression
        stringList.stream()
                .map((var x) -> x.toUpperCase())
                .forEach(System.out::println);

        System.out.println("Using TreeSet with Java 11 Predicate.not() method");
        Set<String> treeset = new TreeSet<>() ;
        treeset.add("JavaScript");
        treeset.add("Java");
        treeset.add("Python");
        treeset.add("C++");
        treeset.stream()
                .filter(java.util.function.Predicate.not(String::isBlank))
                .forEach(System.out::println);


        Set<String> sortedSet = new SortedSet<>();
    }



}
