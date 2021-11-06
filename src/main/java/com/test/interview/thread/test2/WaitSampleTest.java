package com.test.interview.thread.test2;

public class WaitSampleTest {
	public static void main(String[] args) {
		final WaitSample sm = new WaitSample();
		try {
			sm.metod();
//			(new Thread() {
//				public void run() {
//					try {
//						sm.metod();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				};
//			}).start();

			Thread.sleep(1000);
			sm.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
