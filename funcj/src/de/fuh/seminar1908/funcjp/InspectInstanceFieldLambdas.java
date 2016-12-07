package de.fuh.seminar1908.funcjp;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class InspectInstanceFieldLambdas {
    private static final long STATIC_FINAL_CAPTURE_ME = 0L;
    private static long       staticCaptureMe         = 0L;
    private final long        instanceFinalCaptureMe  = 0L;
    private long              instanceCaptureMe       = 0L;

    private final IntConsumer nonCapturing            = (int i) -> {
                                                          Thread.dumpStack();
                                                          System.err.println(i);
                                                      };
    private final IntConsumer staticFinalCapturing    = (int i) -> {
                                                          Thread.dumpStack();
                                                          System.err.println(i + STATIC_FINAL_CAPTURE_ME);
                                                      };
    private final IntConsumer staticCapturing         = (int i) -> {
                                                          Thread.dumpStack();
                                                          System.err.println(i + staticCaptureMe);
                                                      };
    private final IntConsumer instanceFinalCapturing  = (int i) -> {
                                                          Thread.dumpStack();
                                                          System.err.println(i + instanceFinalCaptureMe);
                                                      };
    private final IntConsumer instanceCapturing       = (int i) -> {
                                                          Thread.dumpStack();
                                                          System.err.println(i + instanceCaptureMe);
                                                      };

    private void inspect() {
        IntStream.of(1).forEach(nonCapturing);
        IntStream.of(1).forEach(staticFinalCapturing);
        IntStream.of(1).forEach(staticCapturing);
        IntStream.of(1).forEach(instanceFinalCapturing);
        IntStream.of(1).forEach(instanceCapturing);
        InspectionUtils.inspect(InspectInstanceFieldLambdas.class);
    }

    public static void main(String[] args) {
        new InspectInstanceFieldLambdas().inspect();
    }
}
