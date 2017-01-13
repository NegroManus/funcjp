package de.fuh.seminar1908.funcjp;

import java.util.stream.IntStream;

public class Reduce {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
    }

    public static void main(String[] args) {
        System.out.println("10! = " + factorial(10));
    }
}
