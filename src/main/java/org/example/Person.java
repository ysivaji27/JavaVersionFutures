package org.example;

import java.util.Objects;

public abstract sealed class Person permits Employee, Manager {
}