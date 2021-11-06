package com.test.core.java8.defaultmethod;

public class InterfaceDoubleImpl implements Interface1, Interface2 {

	@Override
	public void testMethod1() {
		System.out.println("InterfaceDoubleImpl Not a default method");
	}

}
