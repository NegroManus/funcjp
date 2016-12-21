package de.fuh.seminar1908.funcjp;

public class CodeAsDataWithMethRef {
    private static void runMe() {
        // Ich laufe in Thread[Thread-0,5,main]
        System.out.println("Ich laufe in " + Thread.currentThread());
    }

    public static void main(String[] args) {
        Runnable target = CodeAsDataWithMethRef::runMe;
        Thread thread = new Thread(target);
        thread.start();
    }
}