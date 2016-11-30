package de.fuh.seminar1908.funcjp;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InspectionUtils {
    public static void inspect(Class<?> clazz) {
        try {
            Class<?>[] classes = clazz.getDeclaredClasses();
            for (Class<?> cls : classes) {
                System.err.println("Class: " + cls);
            }
            Field[] fields = clazz.getFields();
            for (Field field : fields) {
                System.err.println("Field: " + field);
            }
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                System.err.println("Declared field: " + field);
            }
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                System.err.println("Method: " + method);
            }
            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.err.println("Declared method:" + method);
            }
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
