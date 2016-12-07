package de.fuh.seminar1908.funcjp;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class InspectStaticFieldLambdas {
    private static final long        STATIC_FINAL_CAPTURE_ME = 0L;
    private static long              staticCaptureMe         = 0L;

    private static final IntConsumer nonCapturing            = (int i) -> {
                                                                 Thread.dumpStack();
                                                                 System.err.println(i);
                                                             };
    private static final IntConsumer staticFinalCapturing    = (int i) -> {
                                                                 Thread.dumpStack();
                                                                 System.err.println(i + STATIC_FINAL_CAPTURE_ME);
                                                             };
    private static final IntConsumer staticCapturing         = (int i) -> {
                                                                 Thread.dumpStack();
                                                                 System.err.println(i + staticCaptureMe);
                                                             };

    public static void main(String[] args) {
        IntStream.of(1).forEach(nonCapturing);
        IntStream.of(1).forEach(staticCapturing);
        IntStream.of(1).forEach(staticFinalCapturing);

        InspectionUtils.inspect(InspectStaticFieldLambdas.class);
    }
}
