package de.fuh.seminar1908.funcjp;

import java.util.stream.IntStream;

public class ReorderingOfOperations {
	public static void main(String[] args) {
		// Java ändert die Reihenfolge von map() und filter() nicht, da es nicht wissen kann, ob ein vorher angewandtes map() nicht ein anderes Ergebnis bei filter() haben würde
		IntStream.range(0, 10).map(ReorderingOfOperations::times3).filter(ReorderingOfOperations::filterEven).forEach(System.out::println);
	}

	private static int times3(int x) {
		System.out.println("times3: " + x);
		return x * 2;
	}

	private static boolean filterEven(int x) {
		System.out.println("filterEven: " + x);
		return x % 2 == 0;
	}
}
