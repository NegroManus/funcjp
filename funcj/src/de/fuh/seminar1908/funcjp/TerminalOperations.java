package de.fuh.seminar1908.funcjp;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalOperations {
    public static Stream<String> streamFruits() {
        return Stream.of("Banana", "Apple", "Melon");
    }

    public static void main(String[] args) {
        Predicate<String> lengthIs5 = (String s) -> s.length() == 5;

        System.out.println("Alle Strings mit der L�nge 5:");
        streamFruits().filter(lengthIs5).forEach(System.out::println);

        Optional<String> firstResult = streamFruits().filter(lengthIs5)
                .findFirst();
        firstResult.ifPresent((String s) -> System.out
                .println("Erster String mit der L�nge 5: " + s));

        boolean allMatch = streamFruits().allMatch(lengthIs5);
        System.out.println("Alle Strings haben die L�nge 5: " + allMatch);

        boolean noneMatch = streamFruits().noneMatch(lengthIs5);
        System.out.println("Kein String hat die L�nge 5: " + noneMatch);

        boolean anyMatch = streamFruits().anyMatch(lengthIs5);
        System.out.println("Min. ein String hat die L�nge 5: " + anyMatch);
    }
}
