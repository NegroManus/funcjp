package de.fuh.seminar1908.funcjp;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        // Book functThinking = new Book();
        // functThinking.setTitle("Functional Thinking");
        // functThinking.setAuthors(Arrays.asList("Neal Ford"));
        // functThinking.setYear(Year.of(2014));
        // books.add(functThinking);

        Book j8InAction = new Book();
        j8InAction.setTitle("Java 8 in Action");
        j8InAction.setAuthors(Arrays.asList("Raoul-Gabriel Urma", "Mario Fusco",
                "Alan Mycroft"));
        j8InAction.setYear(Year.of(2014));
        books.add(j8InAction);

        Book j8Lambdas = new Book();
        j8Lambdas.setTitle("Java 8 Lambdas");
        j8Lambdas.setAuthors(Arrays.asList("Richard Warburton"));
        j8Lambdas.setYear(Year.of(2014));
        books.add(j8Lambdas);

        Book fluentPython = new Book();
        fluentPython.setTitle("Fluent Python");
        fluentPython.setAuthors(Arrays.asList("Luciano Ramalho"));
        fluentPython.setYear(Year.of(2016));
        books.add(fluentPython);

        return books;
    }
}
