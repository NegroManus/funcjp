package de.fuh.seminar1908.funcjp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class MethRefKinds {
    private static class ExpensiveObj {
        private ExpensiveObj() {
            // Aufwändige Initialisierung
        }
    }

    private static ExpensiveObj createExpensiveObj() {
        return new ExpensiveObj();
    }

    private static class ExpensiveObjFactory {
        private ExpensiveObj newExpensiveObj() {
            return new ExpensiveObj();
        }
    }

    public static void main(String[] args) {
        // (1.) Referenz auf einen Konstruktor
        Callable<ExpensiveObj> task1 = ExpensiveObj::new;

        // (2.) Referenz auf eine statische Fabrikmethode
        Callable<ExpensiveObj> task2 = MethRefKinds::createExpensiveObj;

        // (3.) Referenz auf eine Instanzmethode
        // einer bestimmten Fabrik
        ExpensiveObjFactory factory = new ExpensiveObjFactory();
        Callable<ExpensiveObj> task3 = factory::newExpensiveObj;

        // (4.) Referenz auf eine Instanzmethode
        // eines beliebigen String-Objektes
        String[] fruits = {"Banana", "Melon", "Apple"};
        Arrays.sort(fruits, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(fruits));
    }
}