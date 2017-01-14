package de.fuh.seminar1908.funcjp;

import java.util.List;
import java.util.stream.Collectors;

public class BooksStreamParallel {
    public static List<String> getJavaBookTitles(List<Book> books) {
        return books.parallelStream()
                .filter((b -> b.getTitle().contains("Java")))
                .map(Book::getTitle).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Book> books = Library.getBooks();
        List<String> titles = getJavaBookTitles(books);
        System.out.println(titles);
    }
}
