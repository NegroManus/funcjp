package de.fuh.seminar1908.funcjp;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ImmutableReductions {
    public static Stream<String> streamFruits() {
        return Stream.of("Banana", "Apple", "Melon");
    }

    public static IntStream nums() {
        return IntStream.range(1, 101);
    }

    public static void main(String[] args) {
        System.out.println("Anzahl Strings: " + streamFruits().count());
        System.out.println("Erster String nach alphabetischer Sortierung: "
                + streamFruits().min(String.CASE_INSENSITIVE_ORDER));
        System.out.println("Längster String: "
                + streamFruits().max(Comparator.comparing(String::length)));

        System.out.println();
        System.out.println("Statistiken zu den Zahlen zwischen 1 und 100");
        System.out.println("Anzahl: " + nums().count());
        System.out.println("Kleinste Zahl: " + nums().min());
        System.out.println("Größter Zahl: " + nums().max());
        System.out.println("Summe: " + nums().sum());
        System.out.println("Durchschnitt: " + nums().average());
        System.out.println("Zusammenfassung: " + nums().summaryStatistics());
    }
}
