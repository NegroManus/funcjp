package de.fuh.seminar1908.funcjp;

import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

public class CodeAsDataWithLambda {
    public static void main(String[] args) {
        // Runnable-Implementierung:
        // - Leere Parameterliste
        // - Rumpf in Form eines Anweisungsblockes
        Thread t1 = new Thread(() -> {
            System.out.println("Ich laufe in " + Thread.currentThread());
        });
        t1.start();

        // Runnable-Implementierung:
        // - Leere Parameterliste
        // - Rumpf in Form eines Ausdrucks
        Thread t2 = new Thread(
                () -> System.out.println("Ich laufe in " + Thread.currentThread()));
        t2.start();

        String[] fruits = new String[] { "Apple", "Melon", "Banana" };
        // Comparator<String>-Implementierung:
        // - Parameterliste inklusive Typen
        // - Rumpf in Form eines Ausdrucks
        Arrays.sort(fruits, (String a, String b) -> {
            return a.length() - b.length();
        });
        System.out.println(Arrays.toString(fruits));

        // Comparator<String>-Implementierung:
        // - Parameterliste ohne Typen
        // - Rumpf in Form eines Ausdrucks
        Arrays.sort(fruits, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(fruits));

        // DoubleUnaryOperator-Implementierung:
        // - Parameterliste ohne Typen und Klammern
        // - Rumpf in Form eines Ausdrucks
        DoubleUnaryOperator pow = a -> a * a;
        // Zur Ausführung muss die abstrakte Methode
        // des Functional Interfaces aufgerufen werden.
        double powerOf12 = pow.applyAsDouble(12);
        System.out.println(powerOf12);
    }
}