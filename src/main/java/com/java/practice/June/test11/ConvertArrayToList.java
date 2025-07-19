package com.java.practice.June.test11;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ConvertArrayToList {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D", "E"};
        // Convert array to list using Arrays.asList
        List<String> list = Arrays.asList(arr);
        // Print the list
        System.out.println("Converted List: " + list);
        // Convert back to array if needed
        String[] newArray = list.toArray(new String[0]);
        System.out.println("Converted Back to Array: " + Arrays.toString(newArray));

        int[] numbers = {1, 2, 3, 4, 5};
        // Convert int array to Integer list
        List<Integer> numberList = Arrays.stream(numbers)
                .boxed() // Convert int to Integer
                .toList(); // Collect to list
        // Print the Integer list
        System.out.println("Converted Integer List: " + numberList);
        // Convert back to int array if needed
        int[] newNumbersArray = numberList.stream()
                .mapToInt(Integer::intValue) // Convert Integer to int
                .toArray(); // Collect to array
        System.out.println("Converted Back to int Array: " + Arrays.toString(newNumbersArray));


        // Example of converting a list to an array
        List<String> stringList = Arrays.asList("Hello", "World", "Java");
        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("Converted String Array: " + Arrays.toString(stringArray));

        // Example of converting a list of integers to an array of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] integerArray = integerList.toArray(new Integer[0]);
        System.out.println("Converted Integer Array: " + Arrays.toString(integerArray));

        // Example of converting a list of doubles to an array of doubles
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        Double[] doubleArray = doubleList.toArray(new Double[0]);
        System.out.println("Converted Double Array: " + Arrays.toString(doubleArray));

        // Example of converting a list of characters to an array of characters
        List<Character> charList = Arrays.asList('A', 'B', 'C', 'D', 'E');
        Character[] charArray = charList.toArray(new Character[0]);
        System.out.println("Converted Character Array: " + Arrays.toString(charArray));

        // Example of converting a list of booleans to an array of booleans
        List<Boolean> booleanList = Arrays.asList(true, false, true, false);
        Boolean[] booleanArray = booleanList.toArray(new Boolean[0]);
        System.out.println("Converted Boolean Array: " + Arrays.toString(booleanArray));

        // Example of converting a list of longs to an array of longs
        List<Long> longList = Arrays.asList(1L, 2L, 3L, 4L, 5L);
        Long[] longArray = longList.toArray(new Long[0]);
        System.out.println("Converted Long Array: " + Arrays.toString(longArray));

        // Example of converting a list of floats to an array of floats
        java.util.List<Float> floatList = Arrays.asList(1.1f, 2.2f, 3.3f, 4.4f, 5.5f);
        Float[] floatArray = floatList.toArray(new Float[0]);
        System.out.println("Converted Float Array: " + Arrays.toString(floatArray));

        // Example of converting a list of bytes to an array of bytes
        List<Byte> byteList = Arrays.asList((byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5);
        Byte[] byteArray = byteList.toArray(new Byte[0]);
        System.out.println("Converted Byte Array: " + Arrays.toString(byteArray));

        // Example of converting a list of short integers to an array of short integers
        List<Short> shortList = Arrays.asList((short) 1, (short) 2, (short) 3, (short) 4, (short) 5);
        Short[] shortArray = shortList.toArray(new Short[0]);
        System.out.println("Converted Short Array: " + Arrays.toString(shortArray));
        // Example of converting a list of BigDecimal to an array of BigDecimal
        java.util.List<java.math.BigDecimal> bigDecimalList = Arrays.asList(
                new java.math.BigDecimal("1.1"),
                new java.math.BigDecimal("2.2"),
                new java.math.BigDecimal("3.3"),
                new java.math.BigDecimal("4.4"),
                new java.math.BigDecimal("5.5")
        );
        java.math.BigDecimal[] bigDecimalArray = bigDecimalList.toArray(new java.math.BigDecimal[0]);
        System.out.println("Converted BigDecimal Array: " + Arrays.toString(bigDecimalArray));
        // Example of converting a list of BigInteger to an array of BigInteger
        java.util.List<java.math.BigInteger> bigIntegerList = Arrays.asList(
                new java.math.BigInteger("1000"),
                new java.math.BigInteger("2000"),
                new java.math.BigInteger("3000"),
                new java.math.BigInteger("4000"),
                new java.math.BigInteger("5000")
        );
        java.math.BigInteger[] bigIntegerArray = bigIntegerList.toArray(new java.math.BigInteger[0]);
        System.out.println("Converted BigInteger Array: " + Arrays.toString(bigIntegerArray));
        // Example of converting a list of custom objects to an array of custom objects
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person{name='" + name + "', age=" + age + '}';
            }
        }
        java.util.List<Person> personList = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );
        Person[] personArray = personList.toArray(new Person[0]);
        System.out.println("Converted Person Array: " + Arrays.toString(personArray));

        // Example of converting a list of strings to an array of strings
        List<String> stringList2 = Arrays.asList("Java", "Python", "C++");
        String[] stringArray2 = stringList2.toArray(new String[0]);
        System.out.println("Converted String Array 2: " + Arrays.toString(stringArray2));

        // Example of converting a list of integers to an array of integers
        java.util.List<Integer> integerList2 = Arrays.asList(10, 20, 30, 40, 50);
        Integer[] integerArray2 = integerList2.toArray(new Integer[0]);
        System.out.println("Converted Integer Array 2: " + Arrays.toString(integerArray2));
        // Example of converting a list of doubles to an array of doubles
        java.util.List<Double> doubleList2 = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
        Double[] doubleArray2 = doubleList2.toArray(new Double[0]);
        System.out.println("Converted Double Array 2: " + Arrays.toString(doubleArray2));

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);

        int temp = 2 ;
        if(temp ==  integerStack.pop()){
            System.out.println("Stack is not empty, popped value: " + temp);
        } else {
            System.out.println("Stack is empty");
        }

        Stack<Character> charStack = new Stack<>();
        charStack.push('A');
        charStack.push('B');

        char temp2 = 'B' ;
        if(temp2 ==  charStack.pop()){
            System.out.println("Stack is not empty, popped value: " + temp2);
        } else {
            System.out.println("Stack is empty");
        }

    }
}
