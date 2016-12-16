package de.fuh.seminar1908.funcjp;

import java.util.concurrent.ForkJoinPool;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(ForkJoinPool.getCommonPoolParallelism());
    }
}
