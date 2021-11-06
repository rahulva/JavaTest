package com.test.interview.thread.test1;

public class Logger {
	private final String name;

	public Logger(String nm) {
		this.name = nm;
	}

	public static final Logger getLogger(String name) {
		return new Logger(name);
	}

	public void info(String msg) {
		System.out.println(name + " :" + msg);
	}
}
