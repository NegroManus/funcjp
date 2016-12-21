package de.fuh.seminar1908.funcjp;

public class CodeAsDataWithAnonClass {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                // Ich laufe in Thread[Thread-0,5,main]
                System.out.println("Ich laufe in " + Thread.currentThread());
            }
        };
        Thread thread = new Thread(target);
        thread.start();
    }
}