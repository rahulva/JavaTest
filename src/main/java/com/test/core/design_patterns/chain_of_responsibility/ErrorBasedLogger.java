package com.test.core.design_patterns.chain_of_responsibility;

public class ErrorBasedLogger extends Logger {
	public ErrorBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: " + msg);
	}
}// End of the ErrorBasedLogger class.