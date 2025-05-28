package org.example;

public class ClassA {

    protected String unnamed(String name) throws NullPointerException {
        return "Hello ClassA " + name;
    }

    public static String unnamedStatic(String name) {
        return "Hello ClassA static " + name;
    }
}
