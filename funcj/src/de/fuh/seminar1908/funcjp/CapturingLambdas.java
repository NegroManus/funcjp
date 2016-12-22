package de.fuh.seminar1908.funcjp;

import java.util.concurrent.atomic.LongAdder;

public class CapturingLambdas {
    public static void main(String[] args) {
        int counter = 0;

        Runnable r1 = () -> {
            // Error: Local variable counter defined in an enclosing scope
            // must be final or effectively final
            // counter = counter + 1;
            System.out.println(counter);
        };

        Runnable r2 = () -> {
            // Error: Lambda expression's local variable counter cannot
            // redeclare another local variable defined in an enclosing scope.
            // int counter = 0;
            System.out.println(counter);
        };

        LongAdder adder = new LongAdder();
        Runnable r3 = () -> {
            adder.increment();
            System.out.println(adder);
        };
    }
}
