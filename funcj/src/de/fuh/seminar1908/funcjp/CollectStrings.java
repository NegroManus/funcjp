package de.fuh.seminar1908.funcjp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStrings {
    public static Stream<String> streamFruits() {
        return Stream.of("Banana", "Melon", "Apple");
    }

    public static void main(String[] args) {
        String compressedFruits = streamFruits().map(String::toLowerCase)
                .collect(Collectors.joining());
        System.out.println("Komprimiertes Obst: " + compressedFruits);

        String fruitsWithoutApple = streamFruits()
                .filter(s -> !s.equals("Apple"))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println("Alles außer Apfel: " + fruitsWithoutApple);
    }
}
