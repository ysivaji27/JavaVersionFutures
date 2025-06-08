package com.java.practice.June.model;

import java.util.List;

public class User {
    String name;
    List<Address> addresses;

    public User(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}