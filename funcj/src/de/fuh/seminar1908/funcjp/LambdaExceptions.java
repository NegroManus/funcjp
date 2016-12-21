package de.fuh.seminar1908.funcjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public class LambdaExceptions {
    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                Files.createTempFile("test", ".tmp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Callable<Path> c = () -> Files.createTempFile("test", ".tmp");
    }
}
