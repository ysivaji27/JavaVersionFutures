package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11samples {

    public static void main(String[] args) throws IOException, InterruptedException {

        //New String Methods
        //String class: isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";

        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        System.out.println(lines);

        //New File Methods
        //We can use the new readString and writeString static methods from the Files class:
//        String tempDir = "/Users/sivajiyelugoti/workspace/Java21exercise";
//        Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
//        String fileContent = Files.readString(filePath);
//        System.out.println(fileContent);


        //The Not Predicate Method
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());


        //Local-Variable Syntax for Lambda
//        List<String> sampleList = Arrays.asList("Java", "Kotlin");
//        String resultString = sampleList.stream()
//                .map((@Nonnull var x) -> x.toUpperCase())
//                .collect(Collectors.joining(", "));


        //The new HTTP client from the java.net.http package was introduced in Java 9. It has now become a standard feature in Java 11.
       // The new HTTP API improves overall performance and provides support for both HTTP/1.1 and HTTP/2:
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:" + 8080))
                .build();
        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());


        // Nest Based Access Control
       // assertThat(MainClass.class.isNestmateOf(MainClass.NestedClass.class)).isTrue();

        //Nested classes are linked to the NestMembers attribute, while the outer class is linked to the NestHost attribute:

       // assertThat(MainClass.NestedClass.class.getNestHost()).isEqualTo(MainClass.class);

       // JVM access rules allow access to private members between nestmates; however, in previous Java versions, the reflection API denied the same access.

      //  Java 11 fixes this issue and provides means to query the new class file attributes using the reflection API:

//        Set<String> nestedMembers = Arrays.stream(MainClass.NestedClass.class.getNestMembers())
//                .map(Class::getName)
//                .collect(Collectors.toSet());

        //assertThat(nestedMembers).contains(MainClass.class.getName(), MainClass.NestedClass.class.getName());

        // Running Java Files
       // we don’t need to compile the Java source files with javac explicitly anymore:
    }

}
