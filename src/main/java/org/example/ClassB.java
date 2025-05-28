package org.example;

public class ClassB extends ClassA {
    // This class extends ClassA and inherits its methods
    // You can add additional methods or properties here if needed

    @Override
    public String unnamed(String name) throws NullPointerException {
        return "Hello ClassB " + name;
    }
//    // Note: The static method here is not overriding the static method in ClassA,
//    public static String unnamedStatic(String name) {
//        return "Hello ClassB static " + name;
//    }

}
