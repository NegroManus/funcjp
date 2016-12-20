package de.fuh.seminar1908.funcjp;

public class RunnableOldStyle {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ich laufe in " + Thread.currentThread());
            }
        });
        thread.start();
    }
}
