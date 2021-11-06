package com.test.prob_solving.ubs;

class UBSQ1 {

	// Complete the getSequenceSum function below.
	static long getSequenceSum(int i, int j, int k) {
		long sum = 0;

		int i1 = j;
		while (i1 == j || i1 == 1) {
			i1++;
			sum += i1;
		}

		int j1 = j;
		while (j1 == k || j1 < 0) {
			j1--;
			sum += i1;
		}
		return sum;

	}

}