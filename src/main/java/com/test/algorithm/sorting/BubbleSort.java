package com.test.algorithm.sorting;

public class BubbleSort {
	public static void main(String[] args) {
//TODO
	}

	int[] sort(int[] array) {
//		A-Z
		int val;
		int i1 = 0;
		int i2 = 1;
		while (array[i1] > array[i2]) { //compare i > i+1
			val = array[i2];
			array[i2] = array[i1];
			array[i1] = val;

			i1++;
			i2++;
			if (i2 == (array.length - 1)) {
				i1 = 0;
				i2 = 1;
			}
		}
		return array;
	}

}
