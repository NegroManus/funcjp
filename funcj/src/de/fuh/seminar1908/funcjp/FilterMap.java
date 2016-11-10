package de.fuh.seminar1908.funcjp;

import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class FilterMap {
	private static IntStream getInputStream() {
		System.out.println("Called supply()");
		return IntStream.range(0, 10);
	}

	private static class IsEvenPredicate implements IntPredicate {
		@Override
		public boolean test(int value) {
			System.out.println(String.format("Called IsEvenPredicate.test(%d)", value));
			return value % 2 == 0;
		}
	}

	private static class MultiplyWith3Operator implements IntUnaryOperator {
		@Override
		public int applyAsInt(int operand) {
			System.out.println(String.format("Called MultiplyWith3Operator.applyAsInt(%d)", operand));
			return operand * 3;
		}

	}

	private static boolean isEven(int num) {
		System.out.println(String.format("Called isEven(%d)", num));
		return num % 2 == 0;
	}

	private static int multiplyWith3(int num) {
		System.out.println(String.format("Called multiplyWith3(%d)", num));
		return num * 3;
	}

	public static void main(String[] args) {
		System.out.println("-- For-Each Loop");
		for (int i = 0; i < 10; i++) {
			if (isEven(i)) {
				int result = multiplyWith3(i);
				System.out.println(result);
			}
		}

		System.out.println("-- Stream: Functional Interfaces");
		IntPredicate isEvenPredicate = new IsEvenPredicate();
		MultiplyWith3Operator multiplyWith3Op = new MultiplyWith3Operator();
		getInputStream().filter(isEvenPredicate).map(multiplyWith3Op).forEach(System.out::println);

		System.out.println("-- Stream: Method References");
		getInputStream().filter(FilterMap::isEven).map(FilterMap::multiplyWith3).forEach(System.out::println);

		System.out.println("-- Stream: Lambdas");
		getInputStream().filter((int num) -> num % 2 == 0).map((int num) -> num * 3).forEach(System.out::println);
	}
}
