package com.test.interview.thread.test1;

public class SampleThread extends Thread {

//	private static final java.util.logging.Logger LOGGER = Logger.getLogger(SampleThread.class.getName());
	com.test.interview.thread.test1.Logger LOGGER = new com.test.interview.thread.test1.Logger(SampleThread.class.getName());
	public int processingCount = 0;

	SampleThread(int processingCount) {
		this.processingCount = processingCount;
		LOGGER.info("1. Thread Created");
	}

	@Override
	public void run() {
		LOGGER.info("2. Thread " + this.getName() + " started");
		while (processingCount > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				LOGGER.info("Thread " + this.getName() + " interrupted");
			}
			processingCount--;
		}
		LOGGER.info("3. Thread " + this.getName() + " exiting");
	}

}
