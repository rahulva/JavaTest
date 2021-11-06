package com.test.interview.thread.test2;

import com.test.interview.thread.test1.Logger;

public class WaitSample {
	private Logger logger = Logger.getLogger(WaitSample.class.getName());

	private Integer val = 10;

	public void metod() throws InterruptedException {
		logger.info("Start");
		logger.info(Thread.currentThread().getName() + " : " + System.currentTimeMillis());
		logger.info(val.toString());
		synchronized (val) {
			logger.info("In Lock");
			wait();
			logger.info("Out Lock : " + System.currentTimeMillis());
		}
		logger.info("End");
	}

	public void release() {
		logger.info("release called on " + this.toString());
		val.notify();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + val;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WaitSample other = (WaitSample) obj;
		if (val != other.val)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WaitSample [logger=" + logger + ", val=" + val + "]";
	}

}
