package com.test.core.java8.func_interface;

@FunctionalInterface
interface sayable {
	void say(String msg);

//	void say2(String msg); // Not possible - can have only one abstract method

	static void staticTest() {
		System.out.println("Static method in Interface - Implementation Mandatory");
	}

	default void defTest() {
		System.out.println("Default method in Interface - Implementation Mandatory");
	}
}

public class FunctionalInterfaceExample implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Hello there");
		sayable.staticTest();
		fie.defTest();

	}

}