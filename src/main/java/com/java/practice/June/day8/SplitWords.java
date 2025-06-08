package com.java.practice.June.day8;

import com.java.practice.June.model.Address;
import com.java.practice.June.model.User;

import java.util.Arrays;
import java.util.List;

public class SplitWords {
    public static void main(String[] args) {
        splitWords1();
        splitWords2();
    }

    private static void splitWords2() {
        List<User> users = List.of(
                new User("Alice", List.of(new Address("Delhi"), new Address("Mumbai"))),
                new User("Bob", List.of(new Address("Pune"))),
                new User("Charlie", List.of(new Address("Delhi"), new Address("Bangalore")))
        );

        List<List<Address>> listOfAddressLists = users.stream()
                .map(User::getAddresses)  // Returns Stream<List<Address>>
                .toList();

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
