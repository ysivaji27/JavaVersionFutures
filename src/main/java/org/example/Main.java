package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";

        Map<Character, Long> charCount = input.chars() // IntStream of codepoints
                .mapToObj(c -> (char) c) // Convert to Stream<Character>
                .filter(c -> c != ' ')   // Optional: Ignore spaces
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        // Print the result
        charCount.forEach((ch, count) ->
                System.out.println("'" + ch + "' : " + count));

        input.chars().mapToObj(c-> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .forEach((ch, count) ->
                        System.out.println("'" + ch + "' : " + count));
    }
}