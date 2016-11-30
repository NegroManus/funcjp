package de.fuh.seminar1908.funcjp;

import java.util.stream.IntStream;

public class InspectLocalInstanceLambdas {
    private static long       staticCaptureMe         = 0L;
    private static final long STATIC_FINAL_CAPTURE_ME = 0L;

    private void inspect() {
        long localCaptureMe = 0L;

        IntStream.of(1).forEach((int i) -> {
            Thread.dumpStack();
            System.err.println(i);
        });
        IntStream.of(1).forEach((int i) -> {
            Thread.dumpStack();
            System.err.println(i + staticCaptureMe);
        });
        IntStream.of(1).forEach((int i) -> {
            Thread.dumpStack();
            System.err.println(i + STATIC_FINAL_CAPTURE_ME);
        });
        IntStream.of(1).forEach((int i) -> {
            Thread.dumpStack();
            System.err.println(i + localCaptureMe);
        });

        InspectionUtils.inspect(InspectLocalInstanceLambdas.class);
    }

    public static void main(String[] args) {
        new InspectLocalInstanceLambdas().inspect();
    }
}
