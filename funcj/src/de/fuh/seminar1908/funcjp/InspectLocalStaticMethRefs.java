package de.fuh.seminar1908.funcjp;

import java.util.stream.IntStream;

public class InspectLocalStaticMethRefs {
    private static long staticCaptureMe = 0L;
    private static final long STATIC_FINAL_CAPTURE_ME = 0L;

    public static void main(String[] args) {
        long localCaptureMe = 0L;

        IntStream.of(1).forEach(InspectLocalStaticMethRefs::nonCapturing);
        IntStream.of(1).forEach(InspectLocalStaticMethRefs::staticCapturing);
        IntStream.of(1).forEach(InspectLocalStaticMethRefs::staticFinalCapturing);
        IntStream.of(1).forEach((int i) -> localCapturing(i, localCaptureMe));

        InspectionUtils.inspect(InspectLocalStaticMethRefs.class);
    }

    private static void nonCapturing(int i) {
        Thread.dumpStack();
        System.err.println(i);
    }

    private static void staticCapturing(int i) {
        Thread.dumpStack();
        System.err.println(i + staticCaptureMe);
    }

    private static void staticFinalCapturing(int i) {
        Thread.dumpStack();
        System.err.println(i + STATIC_FINAL_CAPTURE_ME);
    }

    private static void localCapturing(int i, long localCaptureMe) {
        Thread.dumpStack();
        System.err.println(i + localCaptureMe);
    }
}
