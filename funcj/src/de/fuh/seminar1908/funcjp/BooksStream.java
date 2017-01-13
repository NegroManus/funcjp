package de.fuh.seminar1908.funcjp;

import java.time.Year;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BooksStream {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Fluent Python", Collections.singletonList("Ramalho"),
                        Year.of(2016), 1),
                new Book("Java 8 in Action", Collections.singletonList("Urma"),
                        Year.of(2014), 1));
        List<String> titles = getJavaBookTitles(books);
        System.out.println(titles);
    }

    public static List<String> getJavaBookTitles(List<Book> books) {
        return books.stream().filter((b -> b.getTitle().contains("Java")))
                .map(Book::getTitle).collect(Collectors.toList());
    }
}
