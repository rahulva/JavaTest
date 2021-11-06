package com.test.core.java8.defaultmethod;

public interface Interface1 {

	default void testMethod() {
		System.out.println("Interface1.testMethod - Default Inmplementation of Interface.testMethod");
	}

	static void testStatic() {
		System.out.println("Interface1.testStatic - Default Inmplementation of Interface.testMethod");
	}

	void testMethod1();
}
