package de.fuh.seminar1908.funcjp;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static Stream<String> streamFruits() {
        return Stream.of("Banana", "Apple", "Melon");
    }

    public static void main(String[] args) {
        List<String> startingWithA = streamFruits().peek(System.out::println)
                .filter((s) -> s.startsWith("A")).peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("Mit A beginnend: " + startingWithA);

        List<String> skippedLimited = streamFruits().skip(1).limit(2)
                .collect(Collectors.toList());
        System.out.println("1 übersprungen, 2 genommen: " + skippedLimited);

        List<String> sortedByLength = streamFruits()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println("Nach Länge sortiert: " + sortedByLength);

        List<Character> chars = streamFruits().map(String::toLowerCase)
                .flatMapToInt(String::chars).distinct().sorted()
                .mapToObj(i -> (char) i).collect(Collectors.toList());
        System.out.println("Zeichen: " + chars);
    }
}
