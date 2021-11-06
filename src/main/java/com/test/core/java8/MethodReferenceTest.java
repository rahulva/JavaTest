package com.test.core.java8;

interface Sayable {
	void say();

	default void doSomthig() {
		System.out.println("fdsf");
	}
}

public class MethodReferenceTest {

	public static void doSomething() {
		System.out.println("Test");
	}

	public static void main(String[] args) {

		/**
		 * Method reference means - execute "this" method when calling method of a
		 * functional interface.
		 * 
		 * Method reference can only be used for valid functional interface(Functional
		 * interface contract) where which has only one valid abstract method (Single
		 * Abstract Method(SAM) Interface).
		 */
		Sayable sayable2 = MethodReferenceTest::doSomething;
		sayable2.say();
		sayable2.doSomthig();
	}

}
