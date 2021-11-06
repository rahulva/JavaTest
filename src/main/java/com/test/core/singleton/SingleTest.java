package com.test.core.singleton;

public class SingleTest {
	public static void main(String[] args) {

		Thread thread1 = new Thread("T1") {
			@Override
			public void run() {
				Single.getInstance();
			}
		};
		thread1.start();

		Thread thread2 = new Thread("T1") {
			@Override
			public void run() {
				Single.getInstance();
			}
		};
		thread2.start();

		Thread thread3 = new Thread("T1") {
			@Override
			public void run() {
				Single.getInstance();
			}
		};
		thread3.start();

		Thread thread4 = new Thread("T1") {
			@Override
			public void run() {
				Single.getInstance();
			}
		};
		thread4.start();

		Single.getInstance();
		Single.getInstance();
		Single.getInstance();
	}
}
