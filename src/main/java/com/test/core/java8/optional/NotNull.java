package com.test.core.java8.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class NotNull {
	public static void main(String[] args) {
		Optional<String> test = Optional.empty();

		System.out.println("* Optioncal.isPresent - will tell wheather null or not");
		System.out.println(test.isPresent());

		System.out.println("- Null Value scenarios -");
		try {
			System.out.println("* Accessing Optioncal.get on null value, will result in NoSuchElementException");
			System.out.println(test.get());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		System.out.println("Return the value if present, otherwise return other.");
		System.out.println(test.orElse("Value is Null"));

		System.out.println("If a value is present, and " + "the value matches the given predicate, "
				+ "return an Optional describing the value, " + "otherwise return an empty Optional.");
		System.out.println(optional_filter());
		Optional<String> value = test.filter(val -> val.length() > 1);

	}

	private static Optional<String> optional_filter() {
		String value = "";
		if (value != null && value.length() > 1) {
			return Optional.of("dsads");
		} else {
			return Optional.empty();
		}
	}

}
