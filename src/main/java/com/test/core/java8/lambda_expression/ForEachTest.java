package com.test.core.java8.lambda_expression;

import java.util.Arrays;
import java.util.List;

import com.test.core.java8.model.User;

public class ForEachTest {
	public static void main(String[] args) {

		List<String> values = Arrays.asList("A", "B", "C");

		System.out.println("Java 6/7 Way");
		for (String string : values) {
			System.out.println(string);
		}

		System.out.println("Java Way ");
		values.forEach((val) -> System.out.println(val)); // Lamda // Consumer Interfae

		List<User> users = Arrays.asList(new User("User 1", "Dis Name 1"), new User("User 2", "Dis Name 2"));
		users.forEach((User u) -> {
			System.out.println("Users is : " + u.getNickName());
		});
	}
}
