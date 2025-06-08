package com.java.practice.June.model;

import java.util.List;

public class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }
}

