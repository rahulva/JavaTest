package com.test.core.java8.lambda_expression;

public class LamdaTest4 {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("TEst");

		Thread thread = new Thread(runnable);
		thread.start();
	}
}
