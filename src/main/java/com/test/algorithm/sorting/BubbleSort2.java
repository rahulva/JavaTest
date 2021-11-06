package com.test.algorithm.sorting;

public class BubbleSort2 {
	public static void main(String[] args) {

		int[] num = new int[] { 10, 4, 3, 5, 7, 9 };

		for (int i : num) {
			System.out.println(i);
		}

		// Swapping the to values by traversing the array, continioulsy
		// Termination will automticaally happen.
		int ind = 0;
		while (num[ind] > num[ind + 1]) {
			int val2 = num[ind + 1];
			num[ind + 1] = num[ind];
			num[ind] = val2;

			ind++;
			if (num.length - 1 == ind) {
				ind = 0;
			}
		}

		for (int i : num) {
			System.out.println(i);
		}
	}
}
