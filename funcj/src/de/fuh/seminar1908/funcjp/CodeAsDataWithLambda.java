package de.fuh.seminar1908.funcjp;

import java.util.Arrays;

public class CodeAsDataWithLambda {
    public static void main(String[] args) {
        // Runnable-Implementierung:
        // - Leere Parameterliste
        // - Rumpf in Form eines Anweisungsblocks
        Thread t1 = new Thread(() -> {
            System.out.println("Ich laufe in " + Thread.currentThread());
        });
        t1.start();

        // Runnable-Implementierung:
        // - Leere Parameterliste
        // - Rumpf in Form eines Ausdrucks
        Thread t2 = new Thread(() -> System.out
                .println("Ich laufe in " + Thread.currentThread()));
        t2.start();

        String[] fruits = new String[]{"Banana", "Melon", "Apple"};
        // Comparator<String>-Implementierung:
        // - Parameterliste inklusive Typen
        // - Rumpf in Form eines Anweisungsblocks
        Arrays.sort(fruits, (String a, String b) -> {
            return a.length() - b.length();
        });
        System.out.println(Arrays.toString(fruits));

        // Comparator<String>-Implementierung:
        // - Parameterliste ohne Typen
        // - Rumpf in Form eines Ausdrucks
        Arrays.sort(fruits, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(fruits));
    }
}