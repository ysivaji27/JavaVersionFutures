package org.example;

//create a class named Calculator with all the arithmetic operations
public class Calculator {

    /**
     * Adds two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     */
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }

    /**
     * Calculates the percentage of a with respect to b.
     */
    public double percentage(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot calculate percentage with denominator zero");
        return ((double) a / b) * 100;
    }

    /**
     * Calculates the fraction of a over b as a double.
     */
    public double fraction(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot calculate fraction with denominator zero");
        return (double) a / b;
    }
}
