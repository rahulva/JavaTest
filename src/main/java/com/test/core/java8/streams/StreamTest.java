package com.test.core.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));

		// Find the double of the first even number grater than 3
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
		int result = 0;
		for (int e : values) {
			if (e > 3 && e % 2 == 0) {
				result = e * 2;
				break;
			}
		}
		System.out.println(result);

		Stream<Integer> stream = values.stream();
		stream = stream.filter(e -> e > 3);
		stream = stream.filter(e -> e % 2 == 0);
		stream = stream.map(e -> e * 2);
		Optional<Integer> optional = stream.findFirst();
		System.out.println(optional.get());
	}

	private static boolean isPrime(int number) {
		// imperetive - saying how to do
		// mutability
		// for (int i = 2; i < number; i++) {
		// if (number % 1 == 0)
		// return false;
		// }
		// return number > 1;

		IntPredicate isDivisable = devisor -> number % devisor == 0;

		boolean noneMatch = number > 1 && IntStream.range(2, number).noneMatch(isDivisable);
		return noneMatch;
	}
}
