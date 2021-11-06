package com.test.interview.thread.test1;

public class SampleThreadTest {
	com.test.interview.thread.test1.Logger LOGGER = new com.test.interview.thread.test1.Logger(SampleThreadTest.class.getName());

//	@Test
	public void givenStartedThread_whenJoinCalled_waitsTillCompletion() throws InterruptedException {
		Thread t2 = new SampleThread(1);
		t2.start();
		LOGGER.info("4. Invoking join");
//		t2.join();
		LOGGER.info("5. Returned from join");
//	    assertFalse(t2.isAlive());
		assert t2.isAlive();
	}

	public static void main(String[] args) {
		try {
			new SampleThreadTest().givenStartedThread_whenJoinCalled_waitsTillCompletion();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
