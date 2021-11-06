package com.test.core.java8.defaultmethod;

public interface Interface2 extends Interface1 {

	@Override
	default void testMethod() {
		System.out.println("Interface2 - Default Inmplementation of Interface.testMethod");
	}
}
