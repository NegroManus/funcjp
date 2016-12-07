package de.fuh.seminar1908.funcjp;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class LambdasVsAnonClass {
    private static final IntConsumer staticConsumer   = i -> {
                                                          Thread.dumpStack();
                                                          System.err.println(i);
                                                      };
    private final IntConsumer        instanceConsumer = i -> {
                                                          System.err.println(this);
                                                          Thread.dumpStack();
                                                          System.err.println(i);
                                                      };

    public static void main(String[] args) {
        int captureMe = 0;

        System.err.println(staticConsumer);
        IntStream.of(1).forEach(staticConsumer);
        IntConsumer myInstanceConsumer = new LambdasVsAnonClass().instanceConsumer;
        System.err.println(myInstanceConsumer);
        IntStream.of(1).forEach(myInstanceConsumer);

        IntStream.of(1).forEach((int i) -> {
            Thread.dumpStack();
            System.err.println(i);
        });
        IntStream.of(1).forEach((int i) -> {
            Thread.dumpStack();
            System.err.println(i + captureMe);
        });

        IntStream.of(1).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.err.println(this);
                Thread.dumpStack();
                System.err.println(value);
            }
        });

        IntStream.of(1).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.err.println(this);
                Thread.dumpStack();
                System.err.println(value + captureMe);
            }
        });

        try {
            Class<?>[] classes = LambdasVsAnonClass.class.getDeclaredClasses();
            for (Class<?> clazz : classes) {
                System.err.println("Class: " + clazz);
            }
            Field[] fields = LambdasVsAnonClass.class.getFields();
            for (Field field : fields) {
                System.err.println("Field: " + field);
            }
            Field[] declaredFields = LambdasVsAnonClass.class.getDeclaredFields();
            for (Field field : declaredFields) {
                System.err.println("Field: " + field);
            }
            Method[] methods = LambdasVsAnonClass.class.getMethods();
            for (Method method : methods) {
                System.err.println("Method: " + method);
            }
            Method[] declaredMethods = LambdasVsAnonClass.class.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.err.println("Declared method:" + method);
            }
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
