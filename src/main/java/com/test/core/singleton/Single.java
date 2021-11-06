package com.test.core.singleton;

public final class Single {

	int i;

	private Single() {
		i++;
		System.out.println("New " + i);
	}

	private static Single single;// = new Single();

	public static synchronized Single getInstance() {
		if (null == single) {
			single = new Single();
		}
		return single;
	}
}
