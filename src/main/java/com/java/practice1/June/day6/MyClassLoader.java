package com.java.practice1.June.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyClassLoader extends ClassLoader {
    private final Path classDir;

    public MyClassLoader(Path classDir) {
        this.classDir = classDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            Path file = classDir.resolve(name.replace('.', '/') + ".class");
            byte[] classBytes = Files.readAllBytes(file);
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Cannot load class: " + name, e);
        }
    }
}