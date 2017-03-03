package de.fuh.seminar1908.funcjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSources {

    public static Stream<String> streamFruits() {
        return Stream.of("Banana", "Melon", "Apple");
    }

    public static void main(String[] args) throws IOException {
        List<Book> bookList = new ArrayList<>();
        Stream<Book> books = bookList.stream();
        Stream<Path> children = Files.list(Paths.get("C:\\"));

        int faculty10 = IntStream.range(2, 11).reduce(1, (x, y) -> x * y);
        System.out.println(faculty10);

        long count = IntStream.range(1, 101).count();
        System.out.println(count);
    }
}
