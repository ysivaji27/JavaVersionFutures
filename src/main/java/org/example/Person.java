package org.example;

import java.util.Objects;

public record Person(String name, String address) {
    public static String UNKNOWN_ADDRESS = "Unknown";
/*    public Person {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }*/

    public static Person unnamed(String address) {
        return new Person("Unnamed", address);
    }


}
