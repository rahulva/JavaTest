package com.test.core.java8.defaultmethod;

public class Interface1Impl implements Interface1 {

	@Override
	public void testMethod1() {
		System.out.println("Interface1Impl - Not a default method");
	}

	@Override
	public void testMethod() {
		System.out.println("Default method overriden");
		Interface1.super.testMethod();
	}

}
