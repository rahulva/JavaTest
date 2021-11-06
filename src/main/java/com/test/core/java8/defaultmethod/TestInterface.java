package com.test.core.java8.defaultmethod;

public class TestInterface {
	public static void main(String[] args) {
		Interface1 interface1 = new Interface1Impl();
		interface1.testMethod();
		interface1.testMethod1();

		Interface2 interface2 = new Interface2Impl();
		interface2.testMethod();
		interface2.testMethod1();

		Interface1 intface1 = new InterfaceDoubleImpl();
		intface1.testMethod();
		intface1.testMethod1();
		Interface2 intface2 = new InterfaceDoubleImpl();
		intface2.testMethod();
		intface2.testMethod1();
		
		Interface1.testStatic();
		
	}
}
