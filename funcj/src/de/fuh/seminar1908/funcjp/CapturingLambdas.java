package de.fuh.seminar1908.funcjp;

import java.util.concurrent.atomic.AtomicLong;

public class CapturingLambdas {
    public static void main(String[] args) {
        AtomicLong counter = new AtomicLong();
        Runnable task = () -> {
            long count = counter.incrementAndGet();
            System.out.println("Zum " + count + ". Mal ausgeführt");

            // Restliche Logik
        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}