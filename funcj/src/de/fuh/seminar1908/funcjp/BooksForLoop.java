package de.fuh.seminar1908.funcjp;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BooksForLoop {
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
        List<String> titles = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains("Java")) {
                String title = book.getTitle();
                titles.add(title);
            }
        }
        return titles;
    }
}
