package de.fuh.seminar1908.funcjp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {
        Comparator<String> natural = Comparator.naturalOrder();
        Comparator<String> reverse = Comparator.reverseOrder();
        Comparator<String> nullSafe = Comparator.nullsFirst(natural);
        Comparator<String> length = Comparator.comparing(String::length);
        Comparator<String> lengthReversed = length.reversed();
        Comparator<String> lengthThenNatural = length.thenComparing(natural);

        List<String> fruits = Arrays.asList("Banana", "Apple", "Melon");
        List<Comparator<String>> cmps = Arrays.asList(natural, reverse, length,
                lengthReversed, lengthThenNatural);
        for (Comparator<String> cmp : cmps) {
            fruits.sort(cmp);
            System.out.println(fruits);
        }
    }
}
