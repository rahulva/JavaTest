package com.test.core.java8.streams;

import com.test.core.java8.model.Gender;
import com.test.core.java8.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
	public static void main(String[] args) {
		List<Person> persons = createPerson();
		// Upper case names of female they are older than 18
		List<String> upperNamesOver18 = persons.stream().filter(p -> p.getGender() == Gender.FEMALE && p.getAge() > 18)
				.map(p -> p.getName()).map(nm -> nm.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperNamesOver18);

		persons.stream().filter(p -> p.getGender() == Gender.MALE).forEach(p -> System.out.println(p.getName()));

		persons.stream().filter(p -> p.getGender() == Gender.MALE)
				.map(p -> new Person(p.getName().toUpperCase(), p.getGender(), p.getAge()))
				.forEach(System.out::println);
	}

	public static List<Person> createPerson() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Sara", Gender.FEMALE, 20));
		persons.add(new Person("Sara", Gender.FEMALE, 22));
		persons.add(new Person("Bob", Gender.MALE, 20));
		persons.add(new Person("Paula", Gender.FEMALE, 32));
		persons.add(new Person("Paul", Gender.MALE, 32));
		persons.add(new Person("Jack", Gender.MALE, 2));
		persons.add(new Person("Jack", Gender.MALE, 72));
		persons.add(new Person("Jill", Gender.FEMALE, 12));
		return persons;
	}
}

