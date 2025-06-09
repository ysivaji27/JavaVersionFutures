package com.test.version.changes;

public class Java17samples {

    private static void jsonBlock() {
        String text = """
                {
                  "name": "John Doe",
                  "age": 45,
                  "address": "Doe Street, 23, Java Town"
                }
                """;
        System.out.println(text);
    }

    // Switch Expressions
//    private static void withSwitchExpression(Fruit fruit) {
//        switch (fruit) {
//            case APPLE, PEAR -> System.out.println("Common fruit");
//            case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
//            default -> System.out.println("Undefined fruit");
//        }
//    }

//    private static void withYield(Fruit fruit) {
//        String text = switch (fruit) {
//            case APPLE, PEAR -> {
//                System.out.println("the given fruit was: " + fruit);
//                yield "Common fruit";
//            }
//            case ORANGE, AVOCADO -> "Exotic fruit";
//            default -> "Undefined fruit";
//        };
//        System.out.println(text);
//    }

    //Records
    // public record GrapeRecord(Color color, int nbrOfPits) { }
    // Sealed Classes
    // Pattern matching for instanceof

//    private static void patternMatching() {
//        Object o = new GrapeClass(Color.BLUE, 2);
//        if (o instanceof GrapeClass grape) {
//            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
//        }
//    }

    //Helpful NullPointerExceptions
//    public static void main(String[] args) {
//        HashMap<String, GrapeClass> grapes = new HashMap<>();
//        grapes.put("grape1", new GrapeClass(Color.BLUE, 2));
//        grapes.put("grape2", new GrapeClass(Color.white, 4));
//        grapes.put("grape3", null);
//        var color = ((GrapeClass) grapes.get("grape3")).getColor();
//    }
    //With Java 11, the output will show you the line number where the NullPointerException occurs, but you do not know which chained method resolves to null. You have to find out yourself by means of debugging.
    //With Java 17, the same code results in the following output which shows exactly where the NullPointerException occured.
    //Compact Number Formatting Support

    //Stream.toList()
    //In order to convert a Stream to a List, you need to call the collect method with Collectors.toList(). This is quite verbose as can be seen in the example below.
//    private static void oldStyle() {
//        Stream<String> stringStream = Stream.of("a", "b", "c");
//        List<String> stringList =  stringStream.collect(Collectors.toList());
//        for(String s : stringList) {
//            System.out.println(s);
//        }
//    }
//
//    private static void streamToList() {
//        Stream<String> stringStream = Stream.of("a", "b", "c");
//        List<String> stringList =  stringStream.toList();
//        for(String s : stringList) {
//            System.out.println(s);
//        }
//    }

}
