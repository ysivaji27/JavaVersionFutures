package com.java.practice1.June.test11;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsSample {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Stream<Integer> combinedStream =  Stream.concat(numbers1.stream(),numbers2.stream());
     //    combinedStream.forEach(System.out::println);
        // combinedStream.forEach(s->{ System.out.println(s); });


     //   combinedStream.sorted().forEach(System.out::println);


        combinedStream.filter(StreamsSample::isPrime)
                .forEach(s -> System.out.println("Prime number: " + s));

        String input = "madam";
        boolean isPalindrome = IntStream.range(1,input.length()).allMatch(i-> input.charAt(i) == input.charAt(input.length() - i - 1));
        System.out.println("Is the string \"" + input + "\" a palindrome? " + isPalindrome);
    }

    public static boolean isPrime(int number){
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        //    return true;
        return      IntStream.range(2,(int)Math.sqrt(number)).noneMatch(i->number%i==0);
       // return IntStream.range(2,(int)Math.sqrt(number)).noneMatch(i->number%i==0);
    }
}
