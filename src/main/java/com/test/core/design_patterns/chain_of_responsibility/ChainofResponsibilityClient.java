package com.test.core.design_patterns.chain_of_responsibility;

public class ChainofResponsibilityClient {
	private static Logger doChaining() {
		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);

		Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);

		return consoleLogger;
	}

	public static void main(String args[]) {
		Logger chainLogger = doChaining();

		System.out.println("INFO");
		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
		System.out.println("ERROR");
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
		System.out.println("DEBUG");
		chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
	}
}