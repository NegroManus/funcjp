package de.fuh.seminar1908.funcjp;

import java.util.stream.IntStream;

public class FilterMap {
	private static IntStream supply() {
		System.out.println("Called supply()");
		return IntStream.range(0, 10);
	}

	private static int multiplyWith3(int num) {
		System.out.println(String.format("Called multiplyWith3(%d)", num));
		return num * 3;
	}

	private static boolean isEven(int num) {
		System.out.println(String.format("Called isEven(%d)", num));
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		supply().filter(FilterMap::isEven).map(FilterMap::multiplyWith3).forEach(System.out::println);
	}
}
