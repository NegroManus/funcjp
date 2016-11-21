package de.fuh.seminar1908.funcjp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {
	private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList("the", "and", "of", "to", "a", "i", "it", "in", "or", "is", "d", "s", "as", "so", "but", "be"));

	private static Stream<String> parseWords(String input) {
		// http://download.java.net/java/jdk9/docs/api/java/util/regex/Matcher.html#results--
		return Pattern.compile("\\W+").splitAsStream(input);
	}

	private static Map<String, Long> wordCounts(String input) {
		return parseWords(input).map(w -> w.toLowerCase()).filter(w -> !STOP_WORDS.contains(w)).collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
	}

	public static void main(String[] args) {
		String test = "The quick brown fox ran over the golden front yard while he was eating a large sandwich. My sandwich tastes golden!";
		wordCounts(test).entrySet().forEach(System.out::println);
	}
}
