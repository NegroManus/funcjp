package de.fuh.seminar1908.funcjp;

import java.time.Year;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectToCollections {
    public static void main(String[] args) {
        List<Book> books = Library.getBooks();

        // Sammeln der Autoren in einem Set
        Set<String> set = books.stream().flatMap(b -> b.getAuthors().stream())
                .collect(Collectors.toSet());
        System.out.println("Autoren als Set: " + set);

        // Sammeln in einer Map mit Titel als Schlüssel
        Map<String, Book> map = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Function.identity()));
        System.out.println("Map<Titel, Buch>: " + map);

        // Sammeln der Autoren in einem LinkedHashSet
        Set<String> linkedHashSet = books.stream()
                .flatMap(b -> b.getAuthors().stream())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("Autoren als LinkedHashSet: " + linkedHashSet);

        // Gruppieren nach Java oder nicht
        Map<Boolean, List<Book>> javaOrNot = books.stream().collect(Collectors
                .partitioningBy((b) -> b.getTitle().contains("Java")));
        System.out.println("Java oder nicht: " + javaOrNot);

        // Gruppieren nach Jahr
        Map<Year, List<Book>> byYear = books.stream()
                .collect(Collectors.groupingBy(Book::getYear));
        System.out.println("Gruppiert nach Jahr: " + byYear);

        // Zählen der Bücher pro Jahr
        Map<Year, Long> numBooksPerYear = books.stream().collect(
                Collectors.groupingBy(Book::getYear, Collectors.counting()));
        System.out.println("Bücher pro Jahr: " + numBooksPerYear);
    }
}
