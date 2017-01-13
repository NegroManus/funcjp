package de.fuh.seminar1908.funcjp;

public class Calculator {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {
        Calculator calc = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        int result1 = calc.operateBinary(40, 2, addition);
        System.out.println("40 + 2 = " + result1);
        int result2 = calc.operateBinary(20, 10, subtraction);
        System.out.println("20 - 10 = " + result2);
    }
}