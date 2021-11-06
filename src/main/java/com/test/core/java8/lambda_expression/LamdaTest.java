package com.test.core.java8.lambda_expression;

interface Test1Interface {
	void doSomething();

	default void test() {
		System.out.println("Java 8 Default implementation");
	}
}

interface Test1Interface2 {
	void doSomething(String val);

	default void test() {
		System.out.println("Java 8 Default implementation");
	}
}

interface LamdaIntMultiParam {
	String doSomething(String a, String b);
}

public class LamdaTest {
	public static void main(String[] args) {
		Test1Interface intF1 = new Test1Interface() {

			@Override
			public void doSomething() {
				System.out.println("I am doing something - Before Java 8 !!");
			}
		};
		intF1.doSomething();
		intF1.test();

		System.out.println(
				"---------------------------------------------------------------------------------------------");

		Test1Interface intF2 = () -> {
			System.out.println("I am doing something - Java 8 !!");
		};
		intF2.doSomething();

		Test1Interface intF3 = () -> System.out.println("I am doing something - Java 8 - Single line !!");
		intF3.doSomething();
		intF3.test();

		System.out.println(
				"---------------------------------------------------------------------------------------------");

		Test1Interface2 intF2_1 = (val) -> {
			System.out.println(val);
		};
		intF2_1.doSomething("Java 8 - Lamda Parameter");

		Test1Interface2 intF2_2 = val -> System.out.println(val);
		intF2_2.doSomething("Java 8 - Lamda Parameter - Single line, no ()");

		// Parameters and differenet ways of implementation
		LamdaIntMultiParam lMInt1 = (a, b) -> {
			String val = a + b;
			return val;
		};
		System.out.println(lMInt1.doSomething("S1 ", "S2"));

	}
}
