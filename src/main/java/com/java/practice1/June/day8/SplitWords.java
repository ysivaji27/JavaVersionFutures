package com.java.practice1.June.day8;

import com.java.practice1.June.model.Address;
import com.java.practice1.June.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitWords {
    public static void main(String[] args) {
        splitWords1();
        splitWords2();

        // COVARIANCE
        List<? extends Number> nums = List.of(1, 2.5, 3L);
        Number n = nums.get(0); // ✅ OK
        // nums.add(4); // ❌ Compile-time error
        System.out.printf("Covariance example executed successfully with first element: %s%n", n);
        // CONTRAVARIANCE
        List<? super Number> integers = new ArrayList<>();
        integers.add(1); // ✅ OK
        integers.add(2.1); // ✅ OK
        integers.add(2L); // ✅ OK
        // Integer i = integers.get(0); // ❌ Compile-time error, can't get Integer directly
        Object obj = integers.get(0); // ✅ OK, can get Object
        System.out.printf("Contravariance example executed successfully with first element: %s%n", obj);



    }

    private static void splitWords2() {
        List<User> users = List.of(
                new User("Alice", List.of(new Address("Delhi"), new Address("Mumbai"))),
                new User("Bob", List.of(new Address("Pune"))),
                new User("Charlie", List.of(new Address("Delhi"), new Address("Bangalore")))
        );

        List<List<Address>> listOfAddressLists = users.stream()
                .map(User::getAddresses).collect(Collectors.toList());  // Returns Stream<List<Address>>
        //        .toList();

        System.out.println(listOfAddressLists);

        List<Address> flatAddressList = users.stream()
                .flatMap(user -> user.getAddresses().stream()) // Stream<Address>
                .toList();

        System.out.println(flatAddressList);

    }

    public static  void splitWords1() {
        List<String> sentences = List.of("hello world", "java streams", "split words");

        List<String> words = sentences.stream()
                .map(s -> s.split(" "))         // map gives Stream<String[]>
                .flatMap(Arrays::stream)        // flatMap flattens into Stream<String>
                .toList();

        System.out.println(words); // [hello, world, java, streams]
    }

}
