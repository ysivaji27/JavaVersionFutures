package com.java.practice1.June.day6;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        Path dir = Path.of("out/classes"); // Your compiled class directory
        MyClassLoader loader = new MyClassLoader(dir);

        Class<?> clazz = loader.loadClass("com.example.MyPlugin");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Loaded class: " + clazz.getName());
    }
}
