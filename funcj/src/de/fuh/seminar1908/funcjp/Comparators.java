package de.fuh.seminar1908.funcjp;

import java.util.Comparator;

public class Comparators {
    public static void main(String[] args) {
        Comparator<String> natural = Comparator.naturalOrder();
        Comparator<String> reverse = Comparator.reverseOrder();
        Comparator<String> nullSafe = Comparator.nullsFirst(natural);
        Comparator<String> length = Comparator.comparing(String::length);
        Comparator<String> lengthReversed = length.reversed();
        Comparator<String> lengthThenNatural = length.thenComparing(natural);
    }
}
