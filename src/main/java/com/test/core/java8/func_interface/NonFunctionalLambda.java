package com.test.core.java8.func_interface;

/**
 * Can have only 1 abstract method,
 * and can have static, default, and overriden class method
 */
interface sayable2 {
	String say(String msg);

	String say(String msg, String sa); // Not possible - can have only one abstract method
}

public class NonFunctionalLambda {
	public static void main(String[] args) {
		NonFunctionalLambda fie = new NonFunctionalLambda();
//		fie.say("Hello there");
//		fie.say("Hello there");
//		v -> "String"; 
	}
//private void say(sayable2)
}