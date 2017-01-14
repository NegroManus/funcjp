package de.fuh.seminar1908.funcjp;

import java.util.ArrayList;
import java.util.List;

public class BooksForLoop {
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

    public static void main(String[] args) {
        List<Book> books = Library.getBooks();
        List<String> titles = getJavaBookTitles(books);
        System.out.println(titles);
    }
}
